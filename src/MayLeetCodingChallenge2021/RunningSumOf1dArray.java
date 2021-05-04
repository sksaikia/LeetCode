package MayLeetCodingChallenge2021;

public class RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {
        int[] out = new int[nums.length];

        int sum = 0;

        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            out[i] = sum;
        }

        return out;
    }
}
