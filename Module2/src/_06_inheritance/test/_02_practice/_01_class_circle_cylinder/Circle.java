package _06_inheritance.test._02_practice._01_class_circle_cylinder;

public class Circle {
    public double radius;
    public String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI*radius*radius;
    }

    public String toString() {
        return "Diện tích hình tròn là: "+getArea()+"\nMàu sắc của hình tròn: "+getColor();
    }
}
