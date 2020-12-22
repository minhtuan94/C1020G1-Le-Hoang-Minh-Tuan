package _15_exception_debug_demo.user_exception;

public class CheckedEvenNumberException extends Exception {

    public CheckedEvenNumberException() {
        super("Day khong phai la so chan!!!");
//        System.err.println("Test error");
    }

    public CheckedEvenNumberException(String msg) {
        super(msg);
    }
}
