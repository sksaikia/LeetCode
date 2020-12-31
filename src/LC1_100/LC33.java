package LC1_100;

public class LC33 {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int pivot = findPivot(nums,0,n-1);

        if(pivot==-1)
            return bs(nums,0,n-1,target);

        if(nums[pivot]==target)
            return pivot;

        if(nums[0]<=target)
            return bs(nums,0,pivot-1,target);
        else
            return bs(nums,pivot+1,n-1,target);


    }


    private int bs(int[] ar,int left,int right,int target){

        if(right<left)
            return -1;

        int mid  = left + (right-left)/2;

        if(ar[mid]==target)
            return mid;

        if(ar[mid]>target)
            return bs(ar,left,mid-1,target);
        else
            return bs(ar,mid+1,right,target);

    }

    private int findPivot(int[] ar,int left,int right){

        if(right<left)
            return -1;

        if(left==right)
            return left;

        int mid  = left + (right-left)/2;

        if(mid>left && ar[mid]<ar[mid-1])
            return mid-1;

        if(mid<right && ar[mid]>ar[mid+1])
            return mid;

        if(ar[left]>=ar[mid])
            return findPivot(ar,left,mid-1);
        else
            return findPivot(ar,mid+1,right);


    }
}
