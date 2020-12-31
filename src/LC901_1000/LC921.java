package LC901_1000;
import java.util.*;
public class LC921 {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++){

            char c = s.charAt(i);

            if(c=='(')
                stack.push(c);
            else if(c==')'){
                if(!stack.isEmpty() && stack.peek()=='(')
                    stack.pop();
                else{
                    stack.push(c);
                }
            }


        }

        if(stack.isEmpty())
            return 0;
        return stack.size();


    }
}
