package LC201_300;
import java.util.*;
public class LC207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {


        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i=0;i<=numCourses;i++)
            list.add(new ArrayList<>());


        for(int i=0;i<prerequisites.length;i++){
            list.get(prerequisites[i][0]).add(prerequisites[i][1]);

        }

        boolean[] visited = new boolean[numCourses];
        boolean[] recStack = new boolean[numCourses];

        for(int i=0;i<numCourses;i++){

            if(dfs(visited,recStack,list,i))
                return false;


        }

        return true;

    }

    private boolean dfs(boolean[] visited,boolean[] recStack,ArrayList<ArrayList<Integer>> list,int node){


        if(recStack[node])
            return true;
        if(visited[node])
            return false;

        recStack[node] = true;
        visited[node] = true;


        Iterator it = list.get(node).listIterator();

        while(it.hasNext()){

            int n = (int) it.next();

            if(dfs(visited,recStack,list,n))
                return true;



        }

        recStack[node] = false;
        return false;


    }
}
