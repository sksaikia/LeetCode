package LC101_200;

public class LC162 {
    public int findPeakElement(int[] nums) {
        return method(nums,0,nums.length-1);
    }


    private static int method(int[] ar,int left,int right){


        int mid = (left+right)/2;

        if(mid>left && ar[mid]<ar[mid-1])
            return method(ar,left,mid-1);
        else if(mid<right && ar[mid]<ar[mid+1])
            return method(ar,mid+1,right);
        else
            return mid;

    }
}
