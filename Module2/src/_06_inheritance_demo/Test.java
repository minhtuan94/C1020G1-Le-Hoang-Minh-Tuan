package _06_inheritance_demo;

import _06_inheritance.Student;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("Long",22);
//        System.out.println(student.getName());
        System.out.println(student);

//        Human human = new Human();
//        System.out.println(human.toString());

        student.showInfo("abc", 20);
    }
}
