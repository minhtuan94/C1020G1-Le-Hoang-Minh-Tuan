package _18_string_regex._02_exercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    private static Pattern pattern;
    private Matcher matcher;

    public ValidateClassName() {
    }

    private static final String CLASS_REGEX = "^[CAP][a-zA-Z]*[0-9]{4}[GHIKLM]$";

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

