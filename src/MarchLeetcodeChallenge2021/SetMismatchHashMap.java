package MarchLeetcodeChallenge2021;

import java.util.HashMap;

public class SetMismatchHashMap {
    public int[] findErrorNums(int[] nums) {
        //hashMap to store the frequencies of  numbers
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int i=0;i<nums.length;i++){

            if(hashMap.containsKey(nums[i]))
                hashMap.put(nums[i],hashMap.get(nums[i])+1);
            else
                hashMap.put(nums[i],1);

        }

        int missing = 0;
        int repeat = 0;

        //Check for the missing and repeated numbers.
        for(int i=1;i<=nums.length;i++){
            if(!hashMap.containsKey(i))
                missing = i;
            else if(hashMap.get(i)==2)
                repeat = i;
        }

        //Store them in an array
        int[] ans = new int[2];
        ans[0] = repeat;
        ans[1] = missing;

        return ans;

    }
}
