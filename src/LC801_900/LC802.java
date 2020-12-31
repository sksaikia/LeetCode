package LC801_900;
import java.util.*;
public class LC802 {
    public List<Integer> eventualSafeNodes(int[][] graph) {

        int N = graph.length;

        int[] color = new int[N];

        List<Integer> ans = new ArrayList<>();


        for(int i=0;i<N;i++){

            if(dfs(graph,i,color))
                ans.add(i);

        }

        return ans;



    }
    private boolean dfs(int[][] graph,int n,int[] color){

        if(color[n]>0)
            return color[n] == 2;


        color[n] = 1;

        for(int c: graph[n]){

            if(color[n]==2)
                continue;
            if(color[c]==1 || !dfs(graph,c,color))
                return false;


        }

        color[n] = 2;
        return true;



    }

}
