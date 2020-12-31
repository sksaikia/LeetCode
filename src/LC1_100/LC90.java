package LC1_100;
import java.util.*;
public class LC90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> curr = new ArrayList<>();

        Arrays.sort(nums);

        solve(ans,curr,nums,0);

        return ans;

    }

    private static void solve(List<List<Integer>> ans,List<Integer> curr,int[] nums,int start){

        ans.add(curr);

        for(int i = start;i<nums.length;i++){

            if(i>start && nums[i]==nums[i-1])
                continue;

            curr.add(nums[i]);
            solve(ans,new ArrayList<>(curr),nums,i+1);
            curr.remove(curr.size()-1);


        }


    }

}
