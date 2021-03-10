package patterns.stack;

import java.util.Stack;


//Input : arr[] = {10, 4, 2, 20, 40, 12, 30}
//Output :         -1, 10, 4, -1, -1, 40, 40


public class LastGreaterElement {
    public static void main(String[] args) {
        int   arr[] = {10, 4, 2, 20, 40, 12, 30};
        int[] ans = LastLargerElement(arr,arr.length);
        for (int c:ans)
            System.out.print(c + " ");
    }
    public static int[] LastLargerElement(int[] ar, int n) {

        int[] ans = new int[n];

        int index = n-1;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < ar.length; i++) {


            if (stack.isEmpty())
                ans[i] = -1;
            else if (!stack.isEmpty() && stack.peek() > ar[i])
               ans[i] = stack.peek();
            else if (!stack.isEmpty() && stack.peek() <= ar[i]) {
                while (!stack.isEmpty() && stack.peek() <= ar[i]) {
                    stack.pop();
                }

                if (stack.isEmpty())
                    ans[i] = -1;
                else
                    ans[i] = stack.peek();
            }

            stack.push(ar[i]);

        }


        return ans;
    }
}
