package MarchLeetcodeChallenge2021;

import java.util.Arrays;

public class MissingNumberSorting {
    public int missingNumber(int[] nums) {
        //Sort the array
        Arrays.sort(nums);

        //Check if n is at the last index
        if (nums[nums.length-1] != nums.length) {
            return nums.length;
        }
        //Check whether 0 is at 0th index or not
        else if (nums[0] != 0) {
            return 0;
        }

        // If we get here, then the missing number is on the range (0, n)
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i+1]-nums[i]>1)
                return nums[i+1]-1;
        }

        //No number is missing
        return -1;
    }
}
