package _01_Java_Introduction._02_exercise;

import java.util.Scanner;

public class _01_hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String names = scanner.nextLine();
        System.out.println("Hello: "+names);
    }
}
