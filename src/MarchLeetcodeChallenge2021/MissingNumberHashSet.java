package MarchLeetcodeChallenge2021;

import java.util.HashSet;

public class MissingNumberHashSet {
    public int missingNumber(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();

        //Add numbers to the hashset
        for(int i=0;i<nums.length;i++){
            hashSet.add(nums[i]);
        }

        //If a number starting from 0 is not present in the hashset then return it.
        for(int i=0;i<nums.length;i++){
            if(!hashSet.contains(i))
                return i;
        }
        return nums.length;
    }
}
