package patterns.stack;

import java.util.Stack;

//https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1#
public class NextGreaterElement {

//   Input : [6 8 0 1 3]
//   Output: [8 -1 1 3 -1]
//As we have to find elements whose index is greater than our current index (next greater element), we start



    public static long[] nextLargerElement(long[] ar, int n) {

        long[] ans = new long[n];

        int index = n-1;

        Stack<Long> stack = new Stack<>();

        for(int i=n-1;i>=0;i--){

            if(stack.isEmpty())
                ans[index--] = -1;
            else if(!stack.isEmpty() && stack.peek()>ar[i])
                ans[index--] = stack.peek();
            else if(!stack.isEmpty() && stack.peek()<=ar[i]){

                while(!stack.isEmpty() && stack.peek()<=ar[i])
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
