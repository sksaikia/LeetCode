package LC1_100;

public class LC35 {
    public int searchInsert(int[] nums, int target) {

        int n = nums.length;


        return solve(nums,0,n-1,target);


    }

    private int solve(int[] ar,int left,int right,int target){

        if(right<left)
            return -1;


        if(target>ar[right])
            return right+1;

        if(target<ar[left])
            return left;

        int mid = left + (right-left)/2;

        if(ar[mid]==target)
            return mid;

        if(ar[mid]>target)
            return solve(ar,left,mid-1,target);
        else
            return solve(ar,mid+1,right,target);



    }

}
