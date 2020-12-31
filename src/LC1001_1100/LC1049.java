package LC1001_1100;

public class LC1049 {
    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for(int c:stones)
            sum += c;

        //Need to maximize sum-2*i;

        boolean[][] dp = new boolean[stones.length+1][sum+1];

        int n =stones.length;

        for(int i=0;i<=n;i++)
            dp[i][0] = true;

        for(int i=1;i<=sum;i++)
            dp[0][i] = false;


        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                if(stones[i-1]<=j)
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-stones[i-1]];
                else
                    dp[i][j] = dp[i-1][j];

            }
        }

        int i = sum/2;
        for( i=sum/2;i>=0;i--){
            if(dp[n][i])
                break;
        }

        return sum-2*i;



    }
}
