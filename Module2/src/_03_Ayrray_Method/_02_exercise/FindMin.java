package _03_Ayrray_Method._02_exercise;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        int[] arr;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập giá trị của mảng: ");
        int size = scanner.nextInt();

        arr = new int[size];
        for (int i=0;i<size;i++) {
            System.out.print("Nhập phần tử thứ "+(i+1)+": ");
            arr[i] = scanner.nextInt();
        }
        for (int value : arr) {
            System.out.print(value+"\t");
        }
        System.out.println("");
        int min = arr[0];
        for (int i=1;i<arr.length;i++) {
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.print(min);
    }
}