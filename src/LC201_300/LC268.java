package LC201_300;

import java.util.HashSet;

public class LC268 {
    public int missingNumber(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();


        for(int i=0;i<nums.length;i++){

            hashSet.add(nums[i]);
        }


        int i=0;
        while(true){
            if(!hashSet.contains(i))
                return i;
            i++;
        }


    }
}
