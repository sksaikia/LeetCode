package LC1_100;
import java.util.*;
public class LC41 {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            hashSet.add(nums[i]);
        }


        int i=1;

        while(true){
            if(!hashSet.contains(i))
                return i;
            i++;
        }

    }
}
