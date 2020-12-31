package LC401_500;
import java.util.*;
public class LC402 {
    public String removeKdigits(String num, int k) {

        Stack<Character> stack = new Stack<>();

        for(int i=0;i<num.length();i++){

            char c = num.charAt(i);

            while(!stack.isEmpty() && k>0 && stack.peek()>c){
                stack.pop();
                k--;
            }

            if(!stack.isEmpty() || c!='0')
                stack.push(c);


        }

        while(!stack.isEmpty() && k>0){
            k--;
            stack.pop();
        }

        if(stack.isEmpty())
            return "0";
        StringBuilder str = new StringBuilder("");

        while(!stack.isEmpty()){
            str.append(stack.pop());
        }

        return str.reverse().toString();

    }
}
