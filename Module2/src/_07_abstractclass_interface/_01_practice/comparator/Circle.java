package _07_abstractclass_interface._01_practice.comparator;

public class Circle {
    public double radius = 1.0;
    public String color = "red";
    public boolean filled;
    private final double PI = 3.14;

    public Circle() {
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public Circle(double v) {
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return PI*radius*radius;
    }
 }