package LC501_600;

public class LC516 {
    public int longestPalindromeSubseq(String s) {

        char[] ar= s.toCharArray();

        int left = 0;
        int right = s.length()-1;


        while(left<right){
            char c = ar[left];
            ar[left] = ar[right];
            ar[right] = c;

            left++;
            right--;

        }


        String rev = new String(ar);

        return method(s,rev,s.length());

    }


    private static int method(String x,String y,int n){


        int[][] dp = new int[n+1][n+1];


        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(x.charAt(i-1)==y.charAt(j-1))
                    dp[i][j] = 1 + dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);


            }
        }



        return dp[n][n];




    }
}
