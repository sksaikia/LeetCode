package LC1001_1100;

import java.util.LinkedList;
import java.util.Queue;

public class LC1020 {

        int[] xDir = {1,0,-1,0};
        int[] yDir = {0,-1,0,1};

        static int maxArea;
        static int current;
        public int numEnclaves(int[][] grid) {

            maxArea = 0;
            int row = grid.length;
            //This if condition checks whether the Row is zero or not. If it is 0 then return 0.

            if(row==0)
                return 0;
            int col = grid[0].length;
            //This if condition checks whether the Column is zero or not. If it is 0 then return 0.

            if (col==0)
                return 0;
            //We create a visited matrix of size equal to the grid to keep track of visited grid locations.
            boolean[][] visited = new boolean[row][col];

            //Here we do a search in every possible point in the matrix.
            for (int i=1;i<row-1;i++){
                for (int j=1;j<col-1;j++){
                    if (visited[i][j] == false && grid[i][j]==1){
                        //Here the current value is set to 1. As we have a point which is a land , so size is 1.
                        //We do the bfs on this point and mark all the points which are connected with it .
                        current = 1;

                        //We compare it to the maxArea value .
                        maxArea += bfs(grid,visited,i,j,row,col);;
                    }
                }
            }

            return maxArea;
        }
        private int bfs(int[][] grid, boolean[][] visited, int x, int y, int row, int col) {
            Queue<Node> queue = new LinkedList<>();
            queue.add(new Node(x,y));
            visited[x][y] = true;

            //We have added the point into the queue and also marked that point as visited so that we don't fall into a infinite loop.

            boolean touched_boundary = false;

            while (!queue.isEmpty()){
                //We keep running this loop until the queue is empty.
                Node curr = queue.poll();
                int posX = curr.getX();
                int posY = curr.getY();


                //This loop checks for all the possible paths where the island can extend.
                for (int i=0;i<4;i++){
                    int currX = posX + xDir[i];
                    int currY = posY + yDir[i];

                    //We will check whether we can go to the currX and currY point. And if that point is not visited
                    //we will add that point into the queue and also mark it as visited. Also the current variable keeps
                    //track of the current island size. After we get out of this loop, we return the current value
                    if (isSafe(currX,currY,row,col) && grid[currX][currY]==1 && !visited[currX][currY]){

                        if(currX==0 || currX==row-1 || currY==0 || currY==col-1)
                            touched_boundary = true;

                        queue.add(new Node(currX,currY));
                        visited[currX][currY] = true;
                        current++;
                    }
                }

            }
            if(touched_boundary)
                current = 0;

            return current;



        }




        private  boolean isSafe(int i,int j,int m,int n){
            return (i>=0 && i<m) && (j>=0 && j<n);
        }
        //This is a container class which has two fields, x and y. This class is used to keep the
        //points in the queue as a pair
        static class Node {
            private int x;
            private int y;

            public Node(int x, int y) {
                this.x = x;
                this.y = y;
            }

            public int getX() {
                return x;
            }

            public int getY() {
                return y;
            }
        }
}
