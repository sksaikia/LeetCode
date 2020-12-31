package LC1_100;
import java.util.*;
public class LC39 {
    public List<List<Integer>> combinationSum(int[] ar, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        solve(ar,ans,curr,target,0);


        return ans;


    }


    private void solve(int[] ar,List<List<Integer>> ans,List<Integer> curr,int target,int k){

        if(target<0)
            return ;
        if(target==0){
            ans.add(curr);
            return ;
        }

        for(int i=k;i<ar.length;i++){
            curr.add(ar[i]);
            solve(ar,ans,new ArrayList<>(curr),target-ar[i],i);
            curr.remove(curr.size()-1);

        }



    }
}
