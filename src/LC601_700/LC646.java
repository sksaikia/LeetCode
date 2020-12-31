package LC601_700;
import java.util.*;
public class LC646 {
    public int findLongestChain(int[][] pairs) {

        int n = pairs.length;
        int[] dp = new int[n];


        Arrays.sort(pairs, (a,b) -> a[0] - b[0]);

        Arrays.fill(dp,1);

        for(int i=1;i<n;i++){

            for(int j=0;j<i;j++){

                if(dp[i]<dp[j]+1 && pairs[j][1]<pairs[i][0])
                    dp[i] = dp[j]+1;

            }

        }

        int max = 1;
        for(int c:dp)
            max = Math.max(max,c);

        return max;


    }
}

