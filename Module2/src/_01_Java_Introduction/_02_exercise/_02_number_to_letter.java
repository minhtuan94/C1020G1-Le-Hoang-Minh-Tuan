package _01_Java_Introduction._02_exercise;

import java.util.Scanner;

public class _02_number_to_letter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số cần đọc: ");
        int numbers = scanner.nextInt();
        do {
            if (numbers<0) {
            System.out.println("yêu cầu nhập lại");}
        } while (numbers < 0);
        if (numbers < 20) {
            switch (numbers) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Tưo");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 10:
                    System.out.println("ten");
                    break;
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("Twelve");
                    break;
                case 13:
                    System.out.println("Thirteen");
                    break;
                case 14:
                    System.out.println("Fourteen");
                    break;
                case 15:
                    System.out.println("Fifteen");
                    break;
                case 16:
                    System.out.println("Sixteen");
                    break;
                case 17:
                    System.out.println("Seventeen");
                    break;
                case 18:
                    System.out.println("Eighteen");
                    break;
                case 19:
                    System.out.println("Nineteen");
                    break;
            }
        } else if (numbers < 100) {
            int ch = numbers / 10;
            int dv = numbers % 10;
            switch (ch) {
                case 2:
                    System.out.println("twenty");
                    break;
                case 3:
                    System.out.println("thirty");
                    break;
                case 4:
                    System.out.println("forty");
                    break;
                case 5:
                    System.out.println("fifty");
                    break;
                case 6:
                    System.out.println("sixty");
                    break;
                case 7:
                    System.out.println("seventy");
                    break;
                case 8:
                    System.out.println("eighty");
                    break;
                case 9:
                    System.out.println("ninety");
                    break;
            }
            switch (dv) {
                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.println("-one");
                    break;
                case 2:
                    System.out.println("-tưo");
                    break;
                case 3:
                    System.out.println("-three");
                    break;
                case 4:
                    System.out.println("-four");
                    break;
                case 5:
                    System.out.println("-five");
                    break;
                case 6:
                    System.out.println("-six");
                    break;
                case 7:
                    System.out.println("-seven");
                    break;
                case 8:
                    System.out.println("-eight");
                    break;
                case 9:
                    System.out.println("-nine");
                    break;
            }
        }
    }
}
