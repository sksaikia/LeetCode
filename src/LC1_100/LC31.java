package LC1_100;

public class LC31 {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n-2;

        while(i>=0 && nums[i+1]<=nums[i])
            i--;

        if(i>=0){

            int j = n-1;

            while(j>=0 && nums[j]<=nums[i])
                j--;

            swap(nums,i,j);

        }

        reverse(nums,i+1);

    }

    private void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void reverse(int[] nums,int start){

        int i =start;
        int j = nums.length-1;

        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }


    }
}
