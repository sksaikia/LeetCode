package LC1401_1500;

import java.util.Arrays;

public class LC1498 {
    public int numSubseq(int[] nums, int target) {

        //Sort the array
        Arrays.sort(nums);
        //THis is our answer
        int res = 0;
        int n = nums.length;
        //The two pointers
        int left = 0, right = n - 1;
        //Given in question
        int mod = (int)1e9 + 7;

        int[] pows = new int[n];
        //2^0 is 1.
        pows[0] = 1;

        //We store 2^i in i-th index by doing power and mod operation.
        for (int i = 1 ; i < n ; ++i)
            pows[i] = pows[i - 1] * 2 % mod;

        //THis is the 2 pointer logic . As array is sorted, we will get minimum in left and maximum in right.
        while (left <= right) {
            if (nums[left] + nums[right] > target) {
                right--;
            }
            //If summation is less than equal to target, that range can generate subsequqnces . So we increase our counter.
            else {
                res = (res + pows[right - left]) % mod;
                left++;
            }
        }
        //Return the answer
        return res;
    }
}
