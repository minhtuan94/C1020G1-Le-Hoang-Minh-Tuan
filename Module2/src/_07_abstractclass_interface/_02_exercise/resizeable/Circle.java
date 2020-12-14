package _07_abstractclass_interface._02_exercise.resizeable;

import _06_inheritance.test._01_exercise.Shape;

import java.util.Random;

public class Circle extends Shape implements Resizeable{
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        System.out.println("Trước khi tăng kích thước của Circle: "+percent);
        Random rnd = new Random();
        int x = 1 + rnd.nextInt(100);
        percent += x;
        System.out.println("Sau khi tăng kích thước của Cirle: "+percent);
    }
}