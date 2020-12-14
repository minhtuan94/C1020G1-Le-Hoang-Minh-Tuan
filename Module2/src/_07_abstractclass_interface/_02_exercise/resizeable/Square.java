package _07_abstractclass_interface._02_exercise.resizeable;

import java.util.Random;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        System.out.println("Trước khi tăng kích thước của Square: "+percent);
        Random rnd = new Random();
        int x = 1 + rnd.nextInt(100);
        percent += x;
        System.out.println("Sau khi tăng kích thước của Square: "+percent);
    }
}