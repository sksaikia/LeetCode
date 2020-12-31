package LC1_100;

public class LC5 {
    public String longestPalindrome(String s) {

        int n = s.length();

        int[][] dp = new int[n][n];
        String ans = "";
        int max = 0;

        for(int i=0;i<n;i++){
            dp[i][i] = 1;
            max = 1;
            ans = s.substring(i,i+1);

        }


        for(int i=0;i<n-1;i++){

            if(s.charAt(i)==s.charAt(i+1)){
                dp[i][i+1] = 1;
                max = 2;
                ans = s.substring(i,i+2);

            }

        }


//        for(int i=3;i<=n;i++){

//            for(int j=0;j<=n-i;j++){

//                int end = i+j-1;

//                if(s.charAt(j)==s.charAt(end) && dp[j+1][end-1]==1){
//                    dp[j][end] = 1;
//                    ans = s.substring(j,end+1);
//                }


//            }


//        }


        for(int i=3;i<=n;i++){

            for(int j=0;j<=n-i;j++){

                int end = i+j-1;

                if(s.charAt(j)==s.charAt(end) && dp[j+1][end-1]==1){
                    dp[j][end] = 1;
                    ans = s.substring(j,end+1);
                }
            }

        }



        return ans;

    }
}
