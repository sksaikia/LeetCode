package MarchLeetcodeChallenge2021;

import java.util.Arrays;

public class SetMismatchSorting {
    public int[] findErrorNums(int[] nums) {
        //Sort the array
        Arrays.sort(nums);
        //Answer variables
        int repeat=0,missing=0;

        int min = nums[0];
        int max = nums[nums.length-1];

        for(int i=0;i<nums.length-1;i++){
            //Checking for repeatation
            if(nums[i]==nums[i+1])
                repeat = nums[i];
            //Checking for missing numbers
            if(nums[i+1]-nums[i]>1)
                missing = nums[i+1]-1;
        }
        //Edge case for missing numbers
        if(missing==0){
            if(min!=1)
                missing = 1;
            else
                missing = max+1;
        }
        //Store them in an array
        int[] ans = new int[2];
        ans[0] = repeat;
        ans[1] = missing;

        return ans;

    }
}
