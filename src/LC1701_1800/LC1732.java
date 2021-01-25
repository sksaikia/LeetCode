package LC1701_1800;

import java.util.ArrayList;

public class LC1732 {
    public int largestAltitude(int[] gain) {
        ArrayList<Integer> altitudes = new ArrayList<>();

        //[-5,1,5,0,-7]
        //As we are given relative altitudes between two points, so we need to find the original array in order to
        // find the largest altitude.
        //We start from point 0 at 0 altitude, so we will find the next point by adding the relative altitude to it.
        //We will store the original altitudes in the altitudes list.
        //We then find the maximum from the list to find our output.
        //Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.

        //0 -5 -4 1 1 -6

        altitudes.add(0);
        int prev = 0;
        for(int i=0;i<gain.length;i++){
            prev = prev + gain[i];
            altitudes.add(prev);
        }

        int ans = 0;
        for(int c: altitudes){
            ans = Math.max(c,ans);
        }
        return ans;


    }
}
