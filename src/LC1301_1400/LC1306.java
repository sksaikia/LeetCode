package LC1301_1400;
import java.util.*;
public class LC1306 {
    public boolean canReach(int[] ar, int start) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);

        while(!queue.isEmpty()){

            int curr = queue.poll();


            if(ar[curr]==0)
                return true;

            if(ar[curr]>0){

                if(curr-ar[curr]>=0)
                    queue.add(curr-ar[curr]);
                if(curr+ar[curr]<ar.length)
                    queue.add(curr+ar[curr]);


                ar[curr] = -1;

            }




        }



        return false;
    }
}
