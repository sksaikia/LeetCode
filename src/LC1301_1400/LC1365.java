package LC1301_1400;

import java.util.HashSet;

public class LC1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    ans[i] = ans[i]+1;

                }
            }
        }

        return ans;
    }
}

