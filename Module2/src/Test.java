import _06_inheritance.test._01_exercise.Circle;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        int[] a = {1,2,(int) 5.4,(int)'A'};
//        System.out.println(Arrays.toString(a));
//        ArrayList<Circle> list = new ArrayList<>();
//        try {
//            badMethod();
//            System.out.print("A");
//        }catch (RuntimeException ex){
//            System.out.print("B");
//        }catch (Exception ex1){
//            System.out.print("C");
//        }finally{
//            System.out.print("D");
//        }
//        System.out.print("E");
//    }
//    public static void badMethod(){
//        throw new RuntimeException();
//        try{
//            badMethod();
//            System.out.print("A");
//        }  catch (Exception ex)  {
//            System.out.print("B");
//        } finally {
//            System.out.print("C");
//        }
//        System.out.print("D");
//    }
//    public static void badMethod(){
//        throw new Error();

//        try{
//            System.out.print("Hello world ");
//        }finally{
//            System.out.println("Finally executing ");
//        }

//        try {
//            return;
//        }
//        finally{
//            System.out.println( "Finally" );
//        }

        try {
            int x = 0;
            int y = 5 / x;
            System.out.println(y);
        }catch (ArithmeticException e) {
            System.out.println("Arithmetic");
        }catch (Exception ae) {
            System.out.println("Exception");
        }
        System.out.println("finished");
    }
}
