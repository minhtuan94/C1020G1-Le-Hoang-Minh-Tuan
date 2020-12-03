package _03_Ayrray_Method._01_practice;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
//        Bước 1: Khai báo các biến, nhập và kiểm tra kích thước mảng
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);
//        Bước 2: Nhập giá trị cho các phần tử của mảng
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
//        Bước 3: In ra mảng đã nhập
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int value : array) {
            System.out.print(value + "\t");
        }
//        Bước 4: Đảo ngược thứ tự các phần tử trong mảng
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
//        Bước 5: In ra mảng sau khi đã đảo ngược thứ tự các phần tử

        System.out.printf("%-20s%s", "Reverse array: ", "");
        for (int value : array) {
            System.out.print(value + "\t");
        }
    }
}
