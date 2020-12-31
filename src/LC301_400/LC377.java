package LC301_400;
import java.util.*;
public class LC377 {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target+1];
        Arrays.fill(dp,-1);
        dp[0] = 1;

        return  solve(nums,dp,target);


    }

    private int solve(int[] ar,int[] dp ,int target){

        if(dp[target]!=-1)
            return dp[target];

        int sol = 0;

        for(int i=0;i<ar.length;i++){

            if(ar[i]<=target)
                sol += solve(ar,dp,target-ar[i]);

        }


        dp[target] = sol;
        return dp[target];


    }

}
