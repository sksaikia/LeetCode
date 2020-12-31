package LC1301_1400;
import java.util.*;
public class LC1338 {
    public int minSetSize(int[] ar) {


        int n = ar.length;

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int i=0;i<n;i++){

            int x = ar[i];

            if(hashMap.containsKey(x))
                hashMap.put(x,hashMap.get(x)+1);
            else
                hashMap.put(x,1);


        }

        int ans = 0;
        int count = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int m : hashMap.values())
            pq.add(m);


        while(!pq.isEmpty() && count<n/2){
            count += pq.poll();
            ans++;

        }


        return ans;



    }
}
