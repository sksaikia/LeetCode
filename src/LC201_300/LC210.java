package LC201_300;
import java.util.*;
public class LC210 {
    int[] ans ;
    int c ;
    ArrayList<ArrayList<Integer>> list;


    public int[] findOrder(int n, int[][] courses) {

        ans = new int[n];

        c = n-1;
        list = new ArrayList<>();
        for(int i=0;i<n;i++)
            list.add(new ArrayList<>());


        for(int i=0;i<courses.length;i++)
            list.get(courses[i][1]).add(courses[i][0]);


        int[] visited = new int[n];

        for(int i=0;i<n;i++){

            if(visited[i]==0 && !dfs(visited,i))
                return new int[0];

        }

        return ans;


    }

    private boolean dfs(int[] visited,int i){

        visited[i] = -1;


        Iterator it = list.get(i).listIterator();

        while(it.hasNext()){

            int n= (int) it.next();

            if(visited[n]==-1)
                return false;
            else if(visited[n]==0 && !dfs(visited,n))
                return false;


        }

        ans[c--] = i;

        visited[i] = 1;

        return true;

    }


}
