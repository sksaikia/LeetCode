package LC201_300;
import java.util.*;
public class LC278 {
    public int firstBadVersion(int n) {

        //Do a Binary Search for that element
        return solve(1,n);

    }

    private  int solve(int start,int end){

        if(start>=end)
            return start;

        int mid = start + (end-start)/2;

//        if(isBadVersion(mid))
//            return solve(start,mid);
//        else
//            return solve(mid+1,end);


            return 0;
    }
}
