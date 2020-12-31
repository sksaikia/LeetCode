package LC1_100;
import java.util.*;
public class LC16 {
    public int threeSumClosest(int[] nums, int target) {

        int ans = nums[0] + nums[1] + nums[nums.length-1];
        Arrays.sort(nums);

        int left =0 ,right = nums.length-1;

        for(int i=0;i<nums.length;i++){

            left = i + 1;
            right = nums.length-1;

            while(left<right){

                int sum = nums[left] + nums[right] + nums[i];

                if(Math.abs(sum-target)<Math.abs(ans-target))
                    ans = sum;


                if(sum>target)
                    right--;
                else
                    left++;

            }


        }

        return ans;

    }
}
