package LC1001_1100;

import java.util.Stack;

public class LC1021 {
    public String removeOuterParentheses(String S) {

        Stack<Character> stack = new Stack<>();

        //Using a stringbuilder because it is more efficient to add characters to stringbuilder then concatenating strings
        StringBuilder sb = new StringBuilder("");

        for(int i=0;i<S.length();i++){

            //Retrive the current character
            char c = S.charAt(i);

            //If it is an opening brace
            if(c=='('){

                if(!stack.isEmpty())
                    sb.append(c);
                //Push it to the stack
                stack.push(c);

            }else{
                //Remove the element
                stack.pop();

                if(!stack.isEmpty())
                    sb.append(c);


            }

        }
        //Convert it to a string and return it
        return String.valueOf(sb);

    }
}
