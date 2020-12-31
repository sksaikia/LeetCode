package LC701_800;

import java.util.LinkedList;
import java.util.Queue;

public class LC733 {
    int[] row = {1,0,-1,0};
    int[] col = {0,-1,0,1};


    public int[][] floodFill(int[][] mat, int sr, int sc, int newColor) {
        int m = mat.length;
        if (m==0)
            return mat;
        int n = mat[0].length;

        Queue<Node> queue = new LinkedList<>();
        boolean[][] visited = new boolean[m][n];
        queue.add(new Node(sr,sc));

        int oldColor = mat[sr][sc];
        mat[sr][sc] = newColor;
        visited[sr][sc] = true;

        while (!queue.isEmpty()){

            int size = queue.size();

            while (size>0){

                Node currNode = queue.poll();

                for (int i=0;i<4;i++){

                    int dx = currNode.x + row[i];
                    int dy = currNode.y + col[i];

                    if (isValid(dx,dy,m,n) && mat[dx][dy]==oldColor && !visited[dx][dy]){
                        queue.add(new Node(dx,dy));
                        mat[dx][dy] = newColor;
                        visited[dx][dy] = true;
                    }

                }


                size--;
            }

        }

        return mat;

    }


    private static boolean isValid(int i, int j, int m, int n){
        return (i>=0 && j>=0 && i<m && j<n);

    }


    static class Node {

        public int x,y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
