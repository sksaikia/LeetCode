package LC401_500;
import java.util.*;

public class LC442HashMap {
    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            //If we have encountered that number once before, we add it to our ans list.
            if(hashSet.contains(nums[i]))
                ans.add(nums[i]);
            else
                hashSet.add(nums[i]);

        }


        return ans;



    }
}
