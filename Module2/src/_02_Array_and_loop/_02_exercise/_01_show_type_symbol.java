package _02_Array_and_loop._02_exercise;

import java.util.Scanner;

public class _01_show_type_symbol {
    public static void main(String[] args) {
        int choose;
        Scanner scanner = new Scanner(System.in);

        System.out.println("***Menu***");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        choose = scanner.nextInt();

        switch (choose) {
            case 1:
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 7; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            //In hình tam giác vuông, có cạnh góc vuông ở botton-left
            case 2:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                for (int i = 7; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 3:
                for (int i = 0; i < 7; i++) {
                    for (int j = 0; j < 7; j++) {
                        if (j < (7 - 1 - i)) {
                            System.out.print(" ");
                            continue;
                        }
                        System.out.print("*");
                    }
                    for (int j = 1; j <= 1; j++) {
                        System.out.print("*");
                    }
                    System.out.print(" \n");
                    break;
                }
            case 4:
                System.exit(4);
                break;
            default:
                System.out.println("No choose");
        }
    }
}