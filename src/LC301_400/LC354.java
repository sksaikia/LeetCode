package LC301_400;
import java.util.*;
public class LC354 {
    public int maxEnvelopes(int[][] envelopes) {

        Pair[] pairs = new Pair[envelopes.length];
        for(int i=0;i<envelopes.length;i++){
            pairs[i] = new Pair(envelopes[i][0],envelopes[i][1]);
        }

        Arrays.sort(pairs, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.area-o2.area;
            }
        });

        int[] dp = new int[envelopes.length];

        Arrays.fill(dp,1);


        for(int i=1;i<envelopes.length;i++){
            for(int j =0;j<i;j++){
                if(pairs[j].x<pairs[i].x && pairs[j].y<pairs[i].y)
                    dp[i] = Math.max(dp[i],dp[j]+1);

            }
        }

        int max = 0;
        for(int c:dp)
            max = Math.max(max,c);

        return max;

    }

    static class Pair implements Comparator<Pair> {

        public int x,y,area;

        public Pair(int x,int y){
            this.x = x;
            this.y = y;

            area = x*y;
        }


        @Override
        public int compare(Pair o1, Pair o2) {
            return o1.area-o2.area;
        }

    }


}
