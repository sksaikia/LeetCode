package LC1401_1500;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC1403 {
    public List<Integer> minSubsequence(int[] nums) {

        Arrays.sort(nums);

        ArrayList<Integer> list = new ArrayList<>();


        int sum = 0;

        for(int c:nums)
            sum += c;

        int sumRight = 0;

        for(int i=nums.length-1;i>=0;i--){

            list.add(nums[i]);
            sumRight += nums[i];

            sum = sum - nums[i];

            if(sumRight>sum)
                return list;


        }

        return list;

    }
}
