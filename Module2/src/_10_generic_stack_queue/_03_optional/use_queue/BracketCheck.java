package _10_generic_stack_queue._03_optional.use_queue;

import java.util.Stack;

public class BracketCheck{
    public static void main(String[] args) {

        String one = "s * (s – a) * )s – b) * (s – c)  ";
        System.out.println(checkParenthesis(one));

    }

    private static boolean checkParenthesis(String one) {
        Stack<Character> bStack = new Stack<>();
        char[] charArray = one.toCharArray();

        for(char element: charArray){
            if(element =='('){
                bStack.push(element);
            } else if (element == ')'){
                if(bStack.isEmpty()){
                    return false;
                } else {
                    bStack.pop();
                }
            }
        }
        if(bStack.isEmpty())
            return true;
        return false;
    }
}