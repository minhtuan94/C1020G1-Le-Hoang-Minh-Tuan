package _07_abstractclass_interface._01_practice.compareble;

public class Circle {
    public double radius = 1.0;
    public String color = "red";
    public boolean filled;

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
        double PI = 3.14;
        return PI *radius*radius;
    }
 }