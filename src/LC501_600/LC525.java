package LC501_600;
import java.util.*;
public class LC525 {
    public int findMaxLength(int[] nums) {


        HashMap<Integer,Integer> hashMap = new HashMap<>();

        int count = 0,max= 0;

        hashMap.put(0,-1);

        for(int i=0;i<nums.length;i++){

            if(nums[i]==0)
                count += -1;
            else
                count += 1;

            if(hashMap.containsKey(count))
                max = Math.max(max,i-hashMap.get(count));
            else
                hashMap.put(count,i);


        }

        return max;

    }
}
