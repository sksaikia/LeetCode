package LC1201_1300;

public class LC1277 {
    public int countSquares(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int[][] dp = new int[m][n];

        int count = 0;

        for(int i=0;i<m;i++){
            dp[i][0] = mat[i][0];
            count+= mat[i][0];
        }
        //  System.out.println(count);

        for(int i=1;i<n;i++){
            dp[0][i] = mat[0][i];
            count+=mat[0][i];
        }
        //       System.out.println(count);

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(mat[i][j]==1)
                    dp[i][j] = 1 + Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]));
                count += dp[i][j];
            }
        }



        return count;
    }
}
