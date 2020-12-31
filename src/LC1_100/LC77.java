package LC1_100;
import java.util.*;
public class LC77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> curr = new ArrayList<>();

        solve(n,k,ans,curr,1);

        return ans;


    }

    private void solve(int n, int k , List<List<Integer>> ans,List<Integer> curr,int start){

        if(k==curr.size()){
            ans.add(curr);
            return ;

        }

        for(int i=start;i<=n;i++){

            curr.add(i);
            solve(n,k,ans,new ArrayList<>(curr),i+1);
            curr.remove(curr.size()-1);

        }


    }
}
