package LC701_800;

public class LC704 {
    public int search(int[] nums, int target) {

        return method(nums,0,nums.length-1,target);

    }

    private static int method(int[] nums,int left,int right,int target){

        if(left>right)
            return -1;
        int mid = left + (right-left)/2;

        if(nums[mid]==target)
            return mid;

        if(nums[mid]>target)
            return method(nums,left,mid-1,target);
        else
            return method(nums,mid+1,right,target);



    }
}
