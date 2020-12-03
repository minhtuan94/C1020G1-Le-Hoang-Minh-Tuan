package _04_OOP._02_exercise;

import java.util.Scanner;

public class QuadraticEquation {

    private double a, b, c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
            return (-b + Math.sqrt(b * b - 4 * a * c)) / 2 * a;
    }

    public double getRoot2() {
            return (-b - Math.sqrt(b * b - 4 * a * c)) / 2 * a;
    }

    public double getRoot() {
        return (-b)/2*a;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập vào b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập vào c: ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);

        if (quadraticEquation.getDiscriminant()>=0) {
            System.out.println("Nghiệm thứ nhất: "+quadraticEquation.getRoot1());
            System.out.println("Nghiệm thứ hai: "+quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant()==0) {
            System.out.println("phương trình có nghiệm: "+quadraticEquation.getRoot());
        }
        else {
            System.out.println("The equation has no roots");
        }
    }
}
