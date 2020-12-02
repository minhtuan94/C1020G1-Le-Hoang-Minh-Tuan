package _03_Ayrray_Method._02_exercise;

import java.util.Scanner;

public class DelElementFromArray {
    public static void main(String[] args) {
        int[] a;
        int size;
        int x;
        //nhập vào các phần tử của mảng
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng: ");
        size = scanner.nextInt();

        a = new int[size];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            a[i] = scanner.nextInt();
        }
        //hiển thị ra mảng
        for (int value : a) {
            System.out.print(value + "\t");
        }
        System.out.println("");
        System.out.print("Nhập vào số x: ");
        x = scanner.nextInt();
        for (int j = 0; j < a.length; j++) {
            if (x == a[j]) {
                System.out.println("vị trí của x: " + j);
            }
        }
        for (int value : a) {
            if (x == value) {
                continue;
            }
            System.out.print(value + "\t");
        }
    }
}