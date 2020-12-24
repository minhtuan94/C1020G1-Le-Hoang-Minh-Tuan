package _18_string_regex._02_exercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    private static final String ACCOUNT_REGEX = "^[0-9]{2}-0[0-9]{9}$";

    public ValidatePhoneNumber() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static final String[] one = new String[]{"12-121231231","89-1212121212","54-0935305122","04-0492939284"};

    public static void main(String[] args) {
        ValidatePhoneNumber validatePhoneNumber = new ValidatePhoneNumber();
        for (String s : one){
            boolean isValid = validatePhoneNumber.validate(s);
            System.out.println("số điện thoại: " + s +" is valid: "+ isValid);
        }
    }
}
