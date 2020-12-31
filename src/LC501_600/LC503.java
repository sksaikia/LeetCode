package LC501_600;
import java.util.*;
public class LC503 {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;

        int[] ans = new int[n];

        Stack<Integer> stack = new Stack<>();


        for(int i=2*n-1;i>=0;i--){

            if(stack.isEmpty())
                ans[i%n] = -1;
            else if(!stack.isEmpty() && nums[stack.peek()]>nums[i%n])
                ans[i%n] = nums[stack.peek()];
            else if(!stack.isEmpty() && nums[stack.peek()]<=nums[i%n]){
                while(!stack.isEmpty() && nums[stack.peek()]<=nums[i%n])
                    stack.pop();

                if(stack.isEmpty())
                    ans[i%n] = -1;
                else
                    ans[i%n] = nums[stack.peek()];
            }


            stack.push(i%n);



        }


        return ans;

    }
}
