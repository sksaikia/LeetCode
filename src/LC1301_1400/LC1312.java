package LC1301_1400;

public class LC1312 {
    public int minInsertions(String s) {

        int n = s.length();
        int left = 0,right = n-1;

        char[] ar = s.toCharArray();

        while(left<right){

            char c = ar[right];
            ar[right] = ar[left];
            ar[left] = c;
            left++;
            right--;


        }

        String r = new String(ar);

        int length =  method(s,r,s.length(),s.length());

        return n-length;


    }

    private static int method(String x,String y,int n,int m){

        int[][] dp = new int[n+1][m+1];

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(x.charAt(i-1)==y.charAt(j-1))
                    dp[i][j] = 1 + dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);


            }
        }

        return dp[n][m];



    }
}
