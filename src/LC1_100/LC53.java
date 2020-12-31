package LC1_100;

public class LC53 {
    public int maxSubArray(int[] nums) {


        if(nums==null || nums.length==0)
            return 0;

        int max = nums[0];
        int curr = nums[0];

        for(int i=1;i<nums.length;i++){

            curr += nums[i];

            if(nums[i]>curr)
                curr = nums[i];

            max = Math.max(curr,max);

        }


        return max;

    }
}
