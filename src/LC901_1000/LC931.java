package LC901_1000;

public class LC931 {
    public int minFallingPathSum(int[][] ar) {

        int n = ar.length;
        int[][] dp = new int[n][n];
        int best = 0;

        for (int i=0;i<n;i++)
            dp[0][i] = ar[0][i];


        for (int i=1;i<n;i++){
            for (int j=0;j<n;j++){
                if (j==0){
                    best = Math.min(dp[i-1][j],dp[i-1][j+1]);
                    dp[i][j] = best + ar[i][j];
                }
                else if (j==n-1){
                    best = Math.min(dp[i-1][j],dp[i-1][j-1]);
                    dp[i][j] = best + ar[i][j];
                }else{
                    best = Math.min(dp[i-1][j],Math.min(dp[i-1][j+1],dp[i-1][j-1]));
                    dp[i][j] = best + ar[i][j];
                }

            }
        }


        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }


        int min = Integer.MAX_VALUE;
        for (int i=0;i<n;i++)
            min = Math.min(min,dp[n-1][i]);

        return min;
    }
}
