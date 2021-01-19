package LC601_700;

public class LC695DFS {
    //These are the possible directions where we can go,i.e. vertically and horizontally
    int[] x = {1,0,-1,0};
    int[] y = {0,-1,0,1};

    static int current = 0;
    static int ans = 0;

    public int maxAreaOfIsland(int[][] grid) {
        ans = 0;
        int m = grid.length;
        //This if condition checks whether the Row is zero or not. If it is 0 then return 0
        if(m==0)
            return 0;

        int n = grid[0].length;
        //We create a visited matrix of size equal to the grid to keep track of visited grid locations.
        boolean[][] visited = new boolean[m][n];

        //Here we do a search in every possible point in the matrix.
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(visited[i][j]==false && grid[i][j]==1){
                    //Here the current value is set to 1. As we have a point which is a land , so size is 1.
                    //We do the bfs on this point and mark all the points which are connected with it .
                    current =1;
                    util(grid,visited,i,j,m,n);
                    //We compare it to the maxArea value .
                    ans = Math.max(ans, current);
                }
            }
        }
        return ans;
    }

    private void util(int[][] grid,boolean[][] visited,int i,int j,int m,int n){

        //The matrix is marked as visited
        visited[i][j] = true;
        //This loop checks for all the possible paths where the island can extend.
        for(int k=0;k<4;k++){

            int row = i+ x[k];
            int col = j+ y[k];
            //We will check whether we can go to the row and col point. And if that point is not visited
            // Also the current variable keeps track of the current island size.
            //After incrementing we do DFS again on that point.

            if(isSafe(row,col,m,n) && !visited[row][col] && grid[row][col]==1){
                current++;
                util(grid,visited,row,col,m,n);
            }
        }
    }
    //This utility method helps to check whether a point (i,j) is outOfBounds or not.
    private  boolean isSafe(int i,int j,int m,int n){
        return (i>=0 && i<m) && (j>=0 && j<n);
    }

}
