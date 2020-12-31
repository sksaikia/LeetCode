package LC201_300;

public class LC283 {
    public void moveZeroes(int[] nums) {
        int n =nums.length;

        int count =0;
        for(int i=0;i<n;i++){
            if(nums[i]==0)
                count++;
        }


        int j=0;
        for(int i=0;i<n;i++){

            if(nums[i]!=0)
                nums[j++] = nums[i];

        }

        for(int i=j;i<n;i++)
            nums[i] = 0;



    }
}
