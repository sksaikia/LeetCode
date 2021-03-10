package patterns.stack;

import java.util.Stack;

public class NextSmallerElement {
    public static void main(String[] args) {
        int[] ar = {4, 8, 5, 2, 25};
        int[] out = nextSmallerElement(ar,ar.length);
        for (int c:out)
            System.out.print(c + " ");

    }
    public static int[] nextSmallerElement(int[] ar, int n) {

        int[] ans = new int[n];

        int index = n-1;

        Stack<Integer> stack = new Stack<>();

        for(int i=n-1;i>=0;i--){

            if(stack.isEmpty())
                ans[index--] = -1;
            else if(!stack.isEmpty() && stack.peek()<ar[i])
                ans[index--] = stack.peek();
            else if(!stack.isEmpty() && stack.peek()>=ar[i]){

                while(!stack.isEmpty() && stack.peek()>=ar[i])
                    stack.pop();

                if(stack.isEmpty())
                    ans[index--] = -1;
                else
                    ans[index--] = stack.peek();

            }


            stack.push(ar[i]);
        }

        return ans;
    }

}
