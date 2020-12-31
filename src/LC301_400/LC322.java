package LC301_400;

public class LC322 {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;

        int[][] dp = new int[n+1][amount+1];

        int x = Integer.MAX_VALUE -1;

        for(int i=1;i<=n;i++)
            dp[i][0] = 0;

        for(int i=0;i<=amount;i++)
            dp[0][i] = x;

        for(int i=1;i<=amount;i++){

            if(i%coins[0]==0)
                dp[1][i] = i/coins[0];
            else
                dp[1][i] = x;

        }


        for(int i=2;i<=n;i++){
            for(int j=1;j<=amount;j++){
                if(coins[i-1]<=j)
                    dp[i][j] = Math.min(dp[i-1][j],1+dp[i][j-coins[i-1]]);
                else
                    dp[i][j] = dp[i-1][j];
            }
        }

        if(dp[n][amount]==x)
            return -1;
        return dp[n][amount];

    }
}
