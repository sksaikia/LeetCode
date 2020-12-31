package LC1_100;

import java.util.Arrays;
import java.util.HashMap;

public class LC1 {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int[] ans = new int[2];

        for(int i=0;i<nums.length;i++){

            if(hashMap.containsKey(target-nums[i])){
                ans[0] = i;
                ans[1] = hashMap.get(target-nums[i]);
                Arrays.sort(ans);


            }else{
                hashMap.put(nums[i],i);

            }

        }



        return ans;
    }
}
