package LC201_300;

import java.util.HashSet;

public class LC217 {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> hashSet = new HashSet<>();


        for(int i=0;i<nums.length;i++){
            if(hashSet.contains(nums[i]))
                return true;
            else
                hashSet.add(nums[i]);
        }

        return false;
    }
}
