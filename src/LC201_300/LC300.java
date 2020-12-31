package LC201_300;
import java.util.*;
public class LC300 {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];

        if(n==0)
            return 0;

        Arrays.fill(dp,1);

        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j] &&  dp[i]<dp[j]+1)
                    dp[i] = dp[j]+1;
            }
        }

        int max = 1;
        for(int c:dp)
            max = Math.max(max,c);

        return max;
    }
}
