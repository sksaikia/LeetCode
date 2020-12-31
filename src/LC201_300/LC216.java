package LC201_300;
import java.util.*;
public class LC216 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        solve(k,n,1,list,curr);

        return list;

    }

    private void solve(int k,int n,int start,List<List<Integer>> list,List<Integer> curr){

        if(n<0 || k<0)
            return ;

        if(k==0 && n==0){
            list.add(curr);
            return ;
        }

        for(int i=start;i<=9;i++){

            curr.add(i);
            solve(k-1,n-i,i+1,list,new ArrayList<>(curr));
            curr.remove(curr.size()-1);

        }




    }
}
