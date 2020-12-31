package LC201_300;
import java.util.*;
public class LC215 {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        if(nums.length==0)
            return 0;

        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }

        int count=1;
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
