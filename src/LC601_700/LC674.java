package LC601_700;

public class LC674 {
    public int findLengthOfLCIS(int[] nums) {

        if(nums.length==0)
            return 0;

        int count = 1;
        int ans = 1;

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                count++;
                ans = Math.max(ans,count);
            }
            else{
                count=1;

            }

        }

        return ans;
    }
}
