package LC1001_1100;

import java.util.Stack;

public class LC1047 {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();


        for(int i=0;i<s.length();i++){

            char c = s.charAt(i);

            if(!stack.isEmpty() && stack.peek()==c){
                stack.pop();
            }else{
                stack.add(c);
            }



        }
        StringBuilder sb = new StringBuilder("");
        while(!stack.isEmpty()){
            sb.append(stack.pop());

        }



        String x = String.valueOf(sb);

        System.out.println(x);

        return reverse(x);




    }


    private String reverse(String s){

        char[] ar = s.toCharArray();

        int left = 0;
        int right = ar.length-1;

        while(left<right){

            char c = ar[right];
            ar[right] = ar[left];
            ar[left] = c;

            left++;
            right--;


        }


        return new String(ar);


    }
}
