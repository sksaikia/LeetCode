package LC1_100;
import java.util.*;
public class LC20 {
    public boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<str.length();i++){


            char c = str.charAt(i);

            if(c=='(' || c=='[' || c=='{')
                stack.push(c);

            else if(c==')'){
                if(stack.isEmpty())
                    return false;
                if(stack.peek()=='(')
                    stack.pop();
                else if(stack.peek()!='(')
                    return false;

            }  else if(c=='}'){
                if(stack.isEmpty())
                    return false;
                if(stack.peek()=='{')
                    stack.pop();
                else if(stack.peek()!='{')
                    return false;

            }  else if(c==']'){
                if(stack.isEmpty())
                    return false;
                if(stack.peek()=='[')
                    stack.pop();
                else if(stack.peek()!='[')
                    return false;
            }




        }

        if(stack.isEmpty())
            return true;
        return false;



    }
}
