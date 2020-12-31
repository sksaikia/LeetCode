package LC501_600;
import java.util.*;
public class LC581 {
    public int findUnsortedSubarray(int[] nums) {
        Stack<Integer> stack = new Stack<>();

        int low = nums.length , high = 0;


        for(int i=0;i<nums.length;i++){

            while(!stack.isEmpty() && nums[stack.peek()]>nums[i])
                low = Math.min(low,stack.pop());

            stack.push(i);

        }

        stack.clear();

        for(int i=nums.length-1;i>=0;i--){

            while(!stack.isEmpty() && nums[stack.peek()]<nums[i])
                high= Math.max(high,stack.pop());

            stack.push(i);

        }

        if(high-low<=0)
            return 0;
        else
            return high-low+1;

    }
}
