package LC1_100;

public class LC64 {
    public int minPathSum(int[][] grid) {

        if(grid.length==0)
            return 0;

        int[][] dp = new int[grid.length][grid[0].length];


        int m = grid.length;
        int n = grid[0].length;

        dp[0][0] = grid[0][0];

        for(int i=1;i<m;i++)
            dp[i][0] = dp[i-1][0]+ grid[i][0];

        for(int i=1;i<n;i++)
            dp[0][i] = grid[0][i] + dp[0][i-1];



        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){

                dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1])+ grid[i][j];

            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){

                System.out.print(dp[i][j] + " ");

            }
            System.out.println();
        }


        return dp[m-1][n-1];



    }
}
