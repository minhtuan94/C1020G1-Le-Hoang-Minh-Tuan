package _14_sorting_algorithm._02_exercise;

import java.util.Arrays;
import java.util.Scanner;

public class InsertSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int []x;

        System.out.println("Nhập vào kích thước mảng");
        size = scanner.nextInt();
        x = new int[size];

        for (int i = 0; i<size;i++) {
            System.out.print("Nhập phần tử thứ "+(i+1)+": ");
            x[i] = scanner.nextInt();
        }
        for (int element : x) {
            System.out.print(element+"\t");
        }
        System.out.println();
        System.out.println(Arrays.toString(SetupInsertSort.insertionSort(x)));
    }
}