package _15_exception_debug_demo;

public class TestStackOverflow {

    public static void callMain() {
        main(new String[]{});
    }


    public static void main(String[] args) {
        callMain();
    }
}
