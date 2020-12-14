package _05_access_modify._02_exercise.access_modifier;

import _07_abstractclass_interface._01_practice.comparator.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(5.4);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
    }
}