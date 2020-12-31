package LC101_200;

public class LC153 {
    public int findMin(int[] nums) {

        if(nums[0]<nums[nums.length-1])
            return nums[0];

        int pivot = findPivot(nums,0,nums.length-1);
        return pivot;
    }


    private int findPivot(int[] ar,int left,int right){

        if(right<left)
            return -1;

        if(left==right)
            return ar[left];

        int mid = left + (right-left)/2;

        if(mid-1>=0 && ar[mid-1]>ar[mid])
            return ar[mid];

        if(mid+1<ar.length && ar[mid+1]<ar[mid])
            return ar[mid+1];

        if(ar[left]>ar[mid])
            return findPivot(ar,left,mid-1);
        else
            return findPivot(ar,mid+1,right);



    }
}
