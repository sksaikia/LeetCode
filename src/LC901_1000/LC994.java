package LC901_1000;
import java.util.*;
public class LC994 {
    int[] row = {1,0,-1,0};
    int[] col = {0,-1,0,1};
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        if (m==0) return 0;
        int n = grid[0].length;
        if (n==0) return 0;
        if(n==1 && m==1 && grid[0][0]==0)return 0;
        int fresh = 0;
        Queue<Node> queue = new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2)
                    queue.add(new Node(i,j));
                else if(grid[i][j]==1)
                    fresh++;
            }
        }
        int time = 0;
        int getting = 0;
        boolean flag = false;
        while(!queue.isEmpty()){
            int size = queue.size();
            while(size>0){
                Node currNode = queue.poll();
                flag = false;
                for(int i=0;i<4;i++){
                    int dx =  currNode.x + row[i];
                    int dy = currNode.y + col[i];
                    if(isValid(dx,dy,m,n) && grid[dx][dy]==1){
                        flag = true;
                        getting++;
                        queue.add(new Node(dx,dy));
                        grid[dx][dy] = 2;
                    }
                }
                size--;
            }
            time++;
        }
        time--;
        if(getting==fresh)
            return time;
        return -1;
    }

    private  boolean isValid(int i, int j, int m, int n){
        return (i>=0 && j>=0 && i<m && j<n);
    }

    static class Node {
        public int x,y;
        public Node(int x,int y){
            this.x = x;
            this.y = y;
        }
    }
}
