package LC401_500;

public class LC416 {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int c:nums)
            sum += c;

        if(sum%2==1)
            return false;
        else
            return util(nums,sum/2);


    }

    private boolean util(int[] ar,int target){


        int n =ar.length;

        boolean[][] dp = new boolean[n+1][target+1];

        for(int i=0;i<=n;i++)
            dp[i][0] = true;

        for(int i=1;i<=target;i++)
            dp[0][i] = false;


        for(int i=1;i<=n;i++){
            for(int j=1;j<=target;j++){
                if(ar[i-1]<=j)
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-ar[i-1]];
                else
                    dp[i][j] = dp[i-1][j];
            }
        }

        return dp[n][target];

    }

}
