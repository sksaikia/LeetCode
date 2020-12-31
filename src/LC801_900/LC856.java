package LC801_900;
import java.util.*;
public class LC856 {
    public int scoreOfParentheses(String s) {

        Stack<Integer> stack = new Stack<>();

        stack.push(0);

        for(int i=0;i<s.length();i++){

            char c = s.charAt(i);

            if(c=='(')
                stack.push(0);
            else{

                int v = stack.pop();
                int w = stack.pop();
                stack.push(w+Math.max(1,2*v));

            }
        }


        return stack.peek();

    }
}
