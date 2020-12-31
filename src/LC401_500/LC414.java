package LC401_500;
import java.util.*;
public class LC414 {
    public int thirdMax(int[] nums) {

        if(nums.length==0)
            return 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        if(nums.length==0)
            return 0;

        for(int i=0;i<nums.length;i++){
            if (!pq.contains(nums[i]))
                pq.add(nums[i]);
        }

        int count=1;
        int k=3;

        if(pq.size()<3)
            return pq.poll();

        while(!pq.isEmpty() && count<k){
            pq.poll();
            count++;
        }


        if(!pq.isEmpty())
            return pq.poll();
        else
            return 0;

    }
}
