package _07_abstractclass_interface._02_exercise.resizeable;

import _06_inheritance.test._01_exercise.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);

        _07_abstractclass_interface._02_exercise.resizeable.Circle circle1 = new _07_abstractclass_interface._02_exercise.resizeable.Circle();
        circle1.resize(3.4);
    }
}