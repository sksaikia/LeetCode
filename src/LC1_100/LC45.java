package LC1_100;
import java.util.*;
public class LC45 {
    public int jump(int[] nums) {
        int n = nums.length;

        int[] dp = new int[n];

        Arrays.fill(dp,Integer.MAX_VALUE);

        dp[0] = 0;

        for(int i=0;i<n;i++){

            int curr = nums[i];

            for(int j =i+1;j<=i+curr && j<n;j++){

                if(dp[j]==Integer.MAX_VALUE)
                    dp[j] = dp[i]+1;
                else {

                    dp[j] = Math.min(dp[j],dp[i]+1);

                }
            }

        }


        if(dp[n-1]==Integer.MAX_VALUE)
            return -1;
        return dp[n-1];

    }
}
