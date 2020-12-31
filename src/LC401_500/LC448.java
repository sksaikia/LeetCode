package LC401_500;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LC448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();

        int max = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            hashSet.add(nums[i]);
            max = Math.max(nums[i],max);
        }

        int i=1;

        while(i<=nums.length){
            if(!hashSet.contains(i)){
                ans.add(i);
            }

            i++;
        }

        return ans;

    }
}
