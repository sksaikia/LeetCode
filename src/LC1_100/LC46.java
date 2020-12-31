package LC1_100;
import java.util.*;
public class LC46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        solve(nums,list,curr);


        return list;

    }

    public void solve(int[] ar,List<List<Integer>> list,List<Integer> curr){

        if(curr.size()==ar.length){
            list.add(curr);
            return ;
        }


        for(int i=0;i<ar.length;i++){
            if(curr.contains(ar[i]))
                continue;
            curr.add(ar[i]);
            solve(ar,list,new ArrayList<>(curr));
            curr.remove(curr.size()-1);

        }



    }
}
