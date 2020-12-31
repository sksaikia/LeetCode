package LC1501_1600;

import java.util.Arrays;

public class LC1502 {
    public boolean canMakeArithmeticProgression(int[] ar) {

        Arrays.sort(ar);

        int n = ar.length;

        if(n==0 || n==1)
            return true;

        int diff = ar[1]-ar[0];

        for(int i=1;i<ar.length-1;i++){

            if(ar[i+1]-ar[i]!=diff)
                return false;
        }

        return true;


    }
}
