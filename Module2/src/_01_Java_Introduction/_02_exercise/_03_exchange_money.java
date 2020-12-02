package _01_Java_Introduction._02_exercise;

import java.util.Scanner;

public class _03_exchange_money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhập vào số tiền cần chuyển: ");
        double usd = scanner.nextDouble();
        double vnd = 23000*usd;
        System.out.print("Giá trị tiền sao khi đổi: "+vnd);
    }
}
