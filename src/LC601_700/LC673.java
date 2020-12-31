package LC601_700;
import java.util.*;
public class LC673 {
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int[] count = new int[n];

        Arrays.fill(dp,1);
        Arrays.fill(count,1);


        int max = 0;

        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){

                if(nums[j]<nums[i]){

                    if(dp[j]+1==dp[i])
                        count[i] += count[j];
                    else if(dp[j]+1>dp[i]){
                        count[i] = count[j];
                        dp[i] = dp[j]+1;

                    }


                }


            }
        }

        for(int c:dp)
            max = Math.max(max,c);


        int ans = 0;

        for(int i=0;i<nums.length;i++){
            if(dp[i]==max)
                ans += count[i];

        }


        return ans;
    }
}
