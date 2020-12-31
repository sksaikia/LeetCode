package LC1001_1100;

import java.util.Stack;

public class LC1021 {
    public String removeOuterParentheses(String S) {

        Stack<Character> stack = new Stack<>();

        StringBuilder sb = new StringBuilder("");

        for(int i=0;i<S.length();i++){

            char c = S.charAt(i);


            if(c=='('){

                if(!stack.isEmpty())
                    sb.append(c);

                stack.push(c);

            }else{

                stack.pop();

                if(!stack.isEmpty())
                    sb.append(c);


            }

        }

        return String.valueOf(sb);

    }
}
