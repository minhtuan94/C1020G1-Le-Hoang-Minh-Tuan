package _17_io_binary_file._02_exercise.manage_product;

import _17_io_binary_file_demo.Student;

import java.io.*;
import java.util.Scanner;

public class ReadWriteProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choose;
        System.out.println("1. Ghi sản phẩm vào file csv" +
                "\n2. Đọc sản phẩm từ file csv" +
                "\n3. Hiển thị sản phẩm" +
                "\n4. Tìm kiếm sản phẩm từ file csv theo tên");
        System.out.println("========================");
        System.out.println("Chọn menu");

            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    ManageProduct.writeFile();
                    break;
                case 2:
                    ManageProduct.readFile();
                    break;
                case 3:
                    ManageProduct.showInfoProduct();
                    break;
                case 4:
                    ManageProduct.findInfoProduct();
                    break;
                default:
                    System.out.println("No choose");
            }

    }
}