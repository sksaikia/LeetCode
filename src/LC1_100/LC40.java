package LC1_100;
import java.util.*;
public class LC40 {
    public List<List<Integer>> combinationSum2(int[] ar, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(ar);
        solve(ar,target,0,list,curr);

        return list;

    }

    private void solve(int[] ar,int target,int k,List<List<Integer>> list,List<Integer> curr){

        if(target<0)
            return;

        if(target==0){
            list.add(curr);
            return ;
        }


        for(int i=k;i<ar.length;i++){

            if(i>k && ar[i]==ar[i-1])
                continue;

            curr.add(ar[i]);
            solve(ar,target-ar[i],i+1,list,new ArrayList<>(curr));
            curr.remove(curr.size()-1);

        }



    }
}
