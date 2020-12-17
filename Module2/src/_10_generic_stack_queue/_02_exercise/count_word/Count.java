package _10_generic_stack_queue._02_exercise.count_word;

import java.util.Map;
import java.util.TreeMap;

public class Count {
    public static void main(String[] args) {
        String myString = "Tomorrow_is_Wednesday";
        char[] myStringArray = myString.toLowerCase().toCharArray();
        Map<Character, Integer> myNewMap = new TreeMap<>();
        for (char c : myStringArray) {
            if (myNewMap.containsKey(c)) {
                myNewMap.put(c, myNewMap.get(c) + 1);
            } else {
                myNewMap.put(c, 1);
            }
        }
        System.out.println(myNewMap);
    }
}
