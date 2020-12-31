package LC701_800;
import java.util.*;
public class LC739 {
    public int[] dailyTemperatures(int[] ar) {

        int n = ar.length;
        int[] ans = new int[n];

        Stack<Integer> stack = new Stack<>();


        for(int i=n-1;i>=0;i--){

            int x = ar[i];

            if(stack.isEmpty())
                ans[i] = 0;
            else if(!stack.isEmpty() && ar[stack.peek()]> x)
                ans[i] = stack.peek()-i;

            else if(!stack.isEmpty() && ar[stack.peek()]<=x){
                while(!stack.isEmpty() && ar[stack.peek()]<=x)
                    stack.pop();
                if(stack.isEmpty())
                    ans[i] = 0;
                else
                    ans[i] = stack.peek()-i;
            }

            stack.push(i);



        }



        return ans;


    }
}
