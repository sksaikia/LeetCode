package LC701_800;
import java.util.*;
public class LC797 {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        solve(graph,ans,curr,0);

        return ans;

    }

    private static void solve(int[][] graph,List<List<Integer>> ans,List<Integer> curr,int node){


        curr.add(node);

        if(node==graph.length-1){


            ans.add(curr);
            return;

        }

        for(int i=0;i<graph[node].length;i++){

            int res =graph[node][i];

            solve(graph,ans,new ArrayList<>(curr),res);

        }



    }
}
