package _18_string_regex._02_exercise;

public class TestValidateClass {
    public static final String[] one = new String[]{"C1020G1","C1020G","AK1023G","H2344K"};

    public static void main(String[] args) {
        ValidateClassName validateClassName = new ValidateClassName();
        for (String s : one){
            boolean isValid = validateClassName.validate(s);
            System.out.println("Tên lớp: " + s +" is valid: "+ isValid);
        }
    }
}
