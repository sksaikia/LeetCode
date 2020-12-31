package LC1_100;
import java.util.*;
public class LC84 {
    public int largestRectangleArea(int[] ar) {
        int ans = 0;
        int[] left = leftAr(ar);
        int[] right = rightAt(ar);

        for (int i=0;i<ar.length;i++){

            int x = right[i] - left[i] - 1;

            ans = Math.max(ans,x*ar[i]);

        }

        return ans;
    }


    private static int[] leftAr(int[] ar) {

        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[ar.length];

        for (int i=0;i<ar.length;i++){

            if (stack.isEmpty())
                ans[i] = -1;
            else if (!stack.isEmpty() && ar[stack.peek()]<ar[i])
                ans[i] = stack.peek();
            else if (!stack.isEmpty() && ar[stack.peek()]>=ar[i]){
                while (!stack.isEmpty() && ar[stack.peek()]>=ar[i])
                    stack.pop();

                if (stack.isEmpty())
                    ans[i] = -1;
                else
                    ans[i] = stack.peek();
            }
            stack.push(i);

        }


        return ans;
    }


    private static int[] rightAt(int[] ar){
        Stack<Integer> stack = new Stack<>();

        int[] ans = new int[ar.length];

        for (int i=ar.length-1;i>=0;i--){
            if (stack.isEmpty())
                ans[i] = ar.length;
            else if (!stack.isEmpty() && ar[stack.peek()]<ar[i])
                ans[i] = stack.peek();
            else if (!stack.isEmpty() && ar[stack.peek()]>=ar[i]){
                while (!stack.isEmpty() && ar[stack.peek()]>=ar[i])
                    stack.pop();
                if (stack.isEmpty())
                    ans[i] = ar.length;
                else
                    ans[i] = stack.peek();
            }

            stack.push(i);

        }

        return ans;

    }

}
