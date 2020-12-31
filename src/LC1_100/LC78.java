package LC1_100;
import java.util.*;

public class LC78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        solve(nums,0,ans,curr);

        return ans;
    }

    private void solve(int[] nums,int start,List<List<Integer>> list,List<Integer> curr){

        list.add(curr);

        for(int i=start;i<nums.length;i++){

            curr.add(nums[i]);
            solve(nums,i+1,list,new ArrayList<>(curr));

            curr.remove(curr.size()-1);


        }



    }

}
