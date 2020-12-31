package LC101_200;

public class LC189 {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;

        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);


    }

    private void reverse(int[] ar,int i,int j){

        int left = i;
        int right = j;

        while(left<right){

            int temp = ar[left];
            ar[left] = ar[right];
            ar[right] = temp;

            left++;
            right--;
        }


    }
}
