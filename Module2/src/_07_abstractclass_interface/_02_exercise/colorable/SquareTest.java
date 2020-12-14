package _07_abstractclass_interface._02_exercise.colorable;

public class SquareTest {
    public static void main(String[] args) {
//        Square square = new Square();
//        System.out.println(square);
//
//        square = new Square(2.3);
//        System.out.println(square);
//
//        square = new Square(5.8, "yellow", true);
//        System.out.println(square);
        Shape [] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();
        for (Shape shape : shapes) {
            if (shape instanceof Colorable) {
                Colorable colorable = (Colorable) shape;
                colorable.howToColor();
            }
//            System.out.println(shape.getArea());
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                System.out.println(circle.getArea());
            } else if (shape instanceof Rectangle) {
                System.out.println(((Rectangle)shape).getArea()); //vì dùng abstract class Shape rồi nên ép kiểu xuống là thừa
            } else {
                System.out.println(((Square)shape).getArea());
            }
        }
    }
}