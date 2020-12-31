package LC701_800;
import java.util.*;
public class LC787 {

    int fare = Integer.MAX_VALUE;
    boolean[] visited;
    ArrayList<ArrayList<Node>> graph ;


    public int findCheapestPrice(int n, int[][] flights, int src, int dest, int K) {

        graph =  new ArrayList<>();

        fare = Integer.MAX_VALUE;

        visited = new boolean[n];

        for (int i=0;i<n;i++)
            graph.add(new ArrayList<>());

        for (int i=0;i<flights.length;i++){

            graph.get(flights[i][0]).add(new Node(flights[i][1],flights[i][2]));

        }


        bfs(graph,src,dest,K,visited,n,0);


        if (fare==Integer.MAX_VALUE)
            return -1;
        return fare;

    }


    private void bfs(ArrayList<ArrayList<Node>> graph, int src, int dest, int k, boolean[] visited, int n, int cost) {

        if (k<-1)
            return;

        if (src==dest){
            fare = Math.min(fare,cost);
            return;
        }

        visited[src] = true;

        for (int i=0;i<graph.get(src).size();i++){

            Node curr = graph.get(src).get(i);

            if(!visited[curr.to] && cost+curr.cost<=fare)
                bfs(graph,curr.to,dest,k-1,visited,n,curr.cost + cost);

        }
        visited[src] = false;



    }

    static class Node {

        public int to,cost;

        public Node(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
    }

}
