package _10_generic_stack_queue._02_exercise;

import java.util.Arrays;
import java.util.Stack;

public class ReserveStack {
    public static void main(String[] args) {
        Number[] intArray = {1,2,3,4,5,6,7,8,9};
        Stack<Number> stack = new Stack<>();

        System.out.println(stack);
        for(Number element : intArray){
            stack.push(element);
        }
        System.out.print(stack+"\t");
        System.out.println();
        for(int i = 0; i< intArray.length; i++){
            intArray[i] = stack.pop();
        }

        System.out.print(stack);
        System.out.println();
        System.out.println(Arrays.toString(intArray));
        for(Number element : intArray){
            System.out.print(element+"\t");
        }
    }
}