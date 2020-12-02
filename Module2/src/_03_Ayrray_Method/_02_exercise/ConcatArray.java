package _03_Ayrray_Method._02_exercise;

import java.util.Scanner;

public class ConcatArray {
    public static void main(String[] args) {
        int [] a;
        int [] b;
        int size;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào kích thước mảng: ");
        size = scanner.nextInt();
        System.out.println("Nhập mảng a");
        a = new int[size];
        for (int i=0;i<size;i++) {
            System.out.print("Nhập phần tử vị trí thứ "+(i+1)+": ");
            a[i] = scanner.nextInt();
        }
        for (int value : a) {
            System.out.print(value+"\t");
        }
        System.out.println("");
        System.out.println("Nhập mảng b: ");
        b = new int[size];
        for (int i=0;i<size;i++) {
            System.out.print("Nhập phần tử vị trí thứ "+(i+1)+": ");
            b[i] = scanner.nextInt();
        }
        for (int value : b) {
            System.out.print(value+"\t");
        }
        System.out.println("");
        int [] c = new int[a.length + b.length];
        for (int i=0;i<a.length;i++) {
            c[i] = a[i];
        }
        for (int i=0;i<b.length;i++) {
            c[i+size] = b[i];
        }
        for (int value : c) {
            System.out.print(value+"\t");
        }
    }
}