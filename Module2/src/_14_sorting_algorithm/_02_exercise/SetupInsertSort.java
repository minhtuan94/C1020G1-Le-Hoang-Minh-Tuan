package _14_sorting_algorithm._02_exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SetupInsertSort {
    public static int[] insertionSort (int [] list) {
        for (int i=0;i<list.length;i++) {
            int currentElement = list[i];
            int j = i - 1;
            for ( ;j>=0 && list[j]>currentElement;j--) {
                list[j+1] = list[j];
            }
            list[j+1] =currentElement;
        }
        return list;
    }

}
