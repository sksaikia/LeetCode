package LC701_800;
import java.util.*;
public class LC785 {
    public boolean isBipartite(int[][] graph) {

        int n = graph.length;

        int[] colors = new int[n];

        Arrays.fill(colors,-1);


        for(int i=0;i<n;i++){

            if(colors[i]==-1)
                if(!dfs(graph,colors,i,0))
                    return false;

        }

        return true;


    }

    private boolean dfs(int[][] graph,int[] colors,int curr,int c){

        colors[curr] = c;

        for(int x : graph[curr]){

            if(colors[x]==-1){

                if(!dfs(graph,colors,x,(c^1)))
                    return false;

            }else if(colors[x]==c)
                return false;


        }


        return true;

    }


}
