package LC401_500;
import java.util.*;
public class LC442Addition {
    public List<Integer> findDuplicates(int[] nums) {

        int n = nums.length;

        //This is our ans list.
        List<Integer> ans = new ArrayList<>();


        for(int i=0;i<n;i++){
            int temp = nums[i];

            //This is done so that we don't go out of bounds for array index.
            while(temp>n)
                temp = temp-n;


            int index = temp-1;

            //Increment the number with n.
            nums[index] += n;

        }

        //All the elements which are greater than 2*n occurs twice.

        for(int i=0;i<n;i++){
            if(nums[i]>2*n)
                ans.add(i+1);
        }


        return ans;


    }
}
