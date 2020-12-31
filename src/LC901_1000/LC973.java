package LC901_1000;
import java.util.*;
public class LC973 {
    public int[][] kClosest(int[][] points, int K) {

        PriorityQueue<queueNode> pq = new PriorityQueue<>(K,new queueNode());

        for(int i=0;i<points.length;i++){

            int x = points[i][0];
            int y = points[i][1];

            float z = (float) Math.sqrt(Math.pow(x,2) + Math.pow(y,2));

            pq.add(new queueNode(z,new Node(x,y)));


        }


        int[][] ans = new int[K][2];
        int count = 0 ;

        while(count<K){

            queueNode qNode = pq.poll();

            Node n = qNode.node;

            ans[count][0] = n.x;
            ans[count][1] = n.y;
            count++;
        }


        return ans;

    }


    public static class Node {

        public int x;
        public int y;

        public Node(){

        }


        public Node(int x,int y){
            this.x = x;
            this.y = y;
        }



    }
    public static class queueNode implements Comparator<queueNode>{

        public Node node;
        public float dist;

        public queueNode(){

        }

        public queueNode(float dist,Node node){
            this.dist = dist;
            this.node = node;
        }


        @Override
        public int compare(queueNode n1 , queueNode n2){

            if(n1.dist>n2.dist)
                return 1;
            else if(n1.dist<n2.dist)
                return -1;
            else
                return 0;

        }




    }


}
