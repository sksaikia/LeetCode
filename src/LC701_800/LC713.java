package LC701_800;

public class LC713 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left = 0;
        int right = 0;

        if(k<=1)
            return 0;

        int ans = 0;

        int prod = 1;

        while(right<nums.length && left<nums.length){

            prod *= nums[right];

            while(prod>=k){
                prod = prod/nums[left];
                left++;
            }

            ans += right-left+1;

            right++;

        }

        return ans;
    }
}
