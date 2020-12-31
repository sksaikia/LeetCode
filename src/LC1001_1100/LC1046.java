package LC1001_1100;import java.util.*;

public class LC1046 {
    public int lastStoneWeight(int[] ar) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i=0;i<ar.length;i++)
            pq.add(ar[i]);


        while(pq.size()>1){

            int p1 = pq.poll();
            int p2 = pq.poll();
            //  System.out.println("p1 : " + p1 + " p2 : " + p2);
            if (p1!=p2)
                pq.add(Math.abs(p1-p2));

        }


        if(pq.size()==1)
            return pq.poll();
        else
            return 0;

    }
}
