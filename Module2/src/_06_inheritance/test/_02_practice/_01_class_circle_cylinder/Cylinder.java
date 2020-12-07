package _06_inheritance.test._02_practice._01_class_circle_cylinder;

public class Cylinder extends Circle {
    public Cylinder(double width) {
        this.width = width;
    }

    public Cylinder(double radius, String color, double width) {
        super(radius, color);
        this.width = width;
    }

    public double width;

    public double volume() {
        return Math.PI*radius*radius*width;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "width=" + width +
                '}'+"\n"+ super.toString();
    }
}