package _15_exception_debug._02_exercise;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào 3 cạnh của một tam giác");
        try {
            System.out.print("Nhập vào a: ");
            int a = scanner.nextInt();

            System.out.print("Nhập vào b: ");
            int b = scanner.nextInt();

            System.out.print("Nhập vào c: ");
            int c = scanner.nextInt();

            if ((a > 0 & b > 0 & c > 0) || (a + b > c && b + c > a && a + c > b)) {
                System.out.println("Đây là hình tam giác");
            } else {
                throw new IllegalTriangleException("Day khong phai la hinh tam giac");
            }
        } catch (IllegalTriangleException e) {
            System.err.println(e.getMessage());
        }
    }
}
