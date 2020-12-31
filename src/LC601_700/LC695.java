package LC601_700;

public class LC695 {
    int[] x = {1,0,-1,0};
    int[] y = {0,-1,0,1};

    static int c = 0;
    static int ans = 0;

    public int maxAreaOfIsland(int[][] grid) {
        int count = 0;

        ans = 0;

        int m = grid.length;
        if(m==0)
            return 0;
        int n = grid[0].length;



        boolean[][] visited = new boolean[m][n];


        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(visited[i][j]==false && grid[i][j]==1){
                    c =1;
                    util(grid,visited,i,j,m,n);
                    System.out.print(c+" ");
                    ans = Math.max(ans,c);

                }
            }
        }

        return ans;

    }

    private void util(int[][] grid,boolean[][] visited,int i,int j,int m,int n){

        visited[i][j] = true;

        for(int k=0;k<4;k++){

            int row = i+ x[k];
            int col = j+ y[k];

            if(isSafe(row,col,m,n) && !visited[row][col] && grid[row][col]==1){
                c++;
                util(grid,visited,row,col,m,n);
            }


        }





    }
    private  boolean isSafe(int i,int j,int m,int n){


        return (i>=0 && i<m) && (j>=0 && j<n);

    }

}
