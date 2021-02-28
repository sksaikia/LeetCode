package LC201_300;

import java.util.Arrays;

public class LC217Sorting {
    public boolean containsDuplicate(int[] nums) {
        //Sorting the array
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; ++i) {
            //Checking the adjacent element for equality
            if (nums[i] == nums[i + 1]) return true;
        }
        return false;
    }
}
