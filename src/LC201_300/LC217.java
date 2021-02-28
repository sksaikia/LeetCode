package LC201_300;

import java.util.HashSet;

public class LC217 {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> hashSet = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            //If that element is present in the array before, we can return true, because searching in an hashset requires only O(1) time
            if(hashSet.contains(nums[i]))
                return true;
            //We add the number into our hashset
            else
                hashSet.add(nums[i]);
        }

        return false;
    }
}
