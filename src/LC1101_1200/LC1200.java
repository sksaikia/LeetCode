package LC1101_1200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC1200 {
    public List<List<Integer>> minimumAbsDifference(int[] ar) {

        Arrays.sort(ar);

        int min = Integer.MAX_VALUE;

        List<List<Integer>> ans = new ArrayList<>();


        for(int i=0;i<ar.length-1;i++){

            int x = Math.abs(ar[i]-ar[i+1]);
            if(x<min){
                min = x;
                ans = new ArrayList<>();
                List<Integer> curr = new ArrayList<>();
                curr.add(ar[i]);
                curr.add(ar[i+1]);
                ans.add(curr);

            }else if(x==min){
                List<Integer> curr = new ArrayList<>();
                curr.add(ar[i]);
                curr.add(ar[i+1]);
                ans.add(curr);
            }


        }


        return ans;


    }
}
