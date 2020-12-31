package LC1501_1600;

import java.util.Stack;

public class LC1554 {
    public String makeGood(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i=0;i<str.length();i++){

            char c = str.charAt(i);

            if (!stack.isEmpty() && Math.abs(c-stack.peek())==32) {

                stack.pop();
            }else{
                stack.push(c);
            }


        }
        StringBuilder s = new StringBuilder();
        while (!stack.isEmpty()){
            s.append(stack.pop());
        }
        return s.reverse().toString();

    }
}
