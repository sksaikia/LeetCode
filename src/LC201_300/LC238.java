package LC201_300;
import java.util.*;
public class LC238 {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;

        int[] left = new int[n];

        Arrays.fill(left,1);

        for(int i=1;i<n;i++){
            left[i] = left[i-1]*nums[i-1];
        }

        int[] right = new int[n];
        Arrays.fill(right,1);

        for(int i=n-2;i>=0;i--)
            right[i] = right[i+1]*nums[i+1];


        for(int i=0;i<n;i++)
            left[i] = left[i] * right[i];


        return left;

    }
}
