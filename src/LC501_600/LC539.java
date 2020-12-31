package LC501_600;
import java.util.*;
public class LC539 {
    public int findMinDifference(List<String> timePoints) {
        boolean[] seen_times = new boolean[60*24];

        for(String c:timePoints){

            String[] time_split = c.split(":");
            int hour = Integer.parseInt(time_split[0]);
            int minutes = Integer.parseInt(time_split[1]);;


            int count = hour*60 + minutes;

            if(seen_times[count])
                return 0;
            seen_times[count] = true;

        }

        int first_time_seen = Integer.MAX_VALUE;
        int last_seen = Integer.MAX_VALUE;
        int min_diff = Integer.MAX_VALUE;

        for(int i=0;i<1440;i++){

            if(seen_times[i]){

                if(first_time_seen==Integer.MAX_VALUE){
                    first_time_seen = i;
                    last_seen = i;

                }else{


                    min_diff = Math.min(min_diff,Math.min(i-last_seen,1440-i+last_seen));
                    last_seen = i;

                }


            }

        }


        min_diff = Math.min(min_diff,Math.min( last_seen-first_time_seen,1440-last_seen+first_time_seen));

        return min_diff;

    }
}
