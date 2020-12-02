package _03_Ayrray_Method._02_exercise;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] x;
        int size;
        System.out.print("Nhập kích thước mảng: ");
        size = scanner.nextInt();
        x = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            x[i] = scanner.nextInt();
        }
        for (int value : x) {
            System.out.print(value + "\t");
        }
        System.out.println("");
        System.out.print("Nhập phần tử cần chèn: ");
        int value = scanner.nextInt();

        System.out.print("Nhập vào vị trí cần chèn: ");
        int k = scanner.nextInt();

        int[] array2 = new int[x.length + 1];
        System.out.println("Mảng mới : " + array2.length);
        for (int i = 0; i < array2.length; i++) {
            if (i < k) {
                array2[i] = x[i];
            } else if (i == k) {
                array2[i] = value;
            } else if (i > k) {
                array2[i] = x[i - 1];
            }
        }
        for (int v : array2) {
            System.out.print(v + "\t");
        }
    }
}