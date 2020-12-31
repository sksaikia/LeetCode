package LC701_800;

public class LC724
{
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int c:nums)
            sum += c;

        int leftSum = 0;

        for(int i=0;i<nums.length;i++){

            if(leftSum== sum-leftSum-nums[i])
                return i;
            leftSum += nums[i];


        }

        return -1;

    }
}
