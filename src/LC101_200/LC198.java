package LC101_200;

public class LC198 {
    public int rob(int[] ar) {
        int[] dp = new int[ar.length];

        if (ar.length==0)
            return 0;
        if (ar.length==1)
            return ar[0];

        if (ar.length==2)
            return Math.max(ar[0],ar[1]);

        dp[0] = ar[0];
        dp[1] = Math.max(ar[0],ar[1]);

        for (int i=2;i<ar.length;i++)
            dp[i] = Math.max(ar[i]+dp[i-2],dp[i-1]);

//        for (int c:dp)
//            System.out.print(c + "  ");

        return dp[ar.length-1];
    }
}
