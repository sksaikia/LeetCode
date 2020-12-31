package LC101_200;import java.util.*;

public class LC169 {
    public int majorityElement(int[] nums) {

        HashMap<Integer,Integer> hashMap = new HashMap<>();


        for(int i=0;i<nums.length;i++){

            int x = nums[i];


            if(hashMap.containsKey(x))
                hashMap.put(x,hashMap.get(x)+1);
            else
                hashMap.put(x,1);

            if(hashMap.get(x)>=(nums.length/2)+1)
                return x;


        }

        return -1;

    }
}
