package LC201_300;
import java.util.*;
public class LC287 {
    public int findDuplicate(int[] nums) {

        HashSet<Integer> hashSet = new HashSet<>();

        for(int c : nums){
            if(hashSet.contains(c))
                return c;
            hashSet.add(c);
        }

        return 1;

    }
}
