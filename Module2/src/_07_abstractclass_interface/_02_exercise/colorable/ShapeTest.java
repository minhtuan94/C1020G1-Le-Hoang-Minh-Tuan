package _07_abstractclass_interface._02_exercise.colorable;

import _06_inheritance.test._01_exercise.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);


    }
}