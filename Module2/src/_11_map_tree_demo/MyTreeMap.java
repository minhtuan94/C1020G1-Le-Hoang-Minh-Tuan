package _11_map_tree_demo;

import java.util.Map;
import java.util.TreeMap;

public class MyTreeMap {
    public static void main(String[] args) {
        Map<Student, String> myMap = new TreeMap<>();
        myMap.put(new Student(5, "Nguyen Van F"), "Top5");
        myMap.put(new Student(1, "Nguyen Van A"), "Top1");
        myMap.put(new Student(3, "Nguyen Van C"), "Top3");
        myMap.put(new Student(4, "Nguyen Van D"), "Top4");
        myMap.put(new Student(2, "Nguyen Van B"), "Top2");

        System.out.println(myMap.size());
        for (Student student : myMap.keySet()) {
            System.out.println(student.toString() + "Value: " + myMap.get(student));
        }
    }
}
