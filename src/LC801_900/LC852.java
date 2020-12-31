package LC801_900;

public class LC852 {
    public int peakIndexInMountainArray(int[] A) {
        return solve(A,0,A.length-1);
    }


    private int solve(int[] ar,int left,int right){

        if(left>=right)
            return left;

        int mid = left + (right-left)/2;

        if(ar[mid]<ar[mid+1])
            return solve(ar,mid+1,right);
        else
            return solve(ar,left,mid);


    }

}
