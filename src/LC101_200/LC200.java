package LC101_200;

public class LC200 {

    int[] xAr = {1,0,-1,0};
    int[] yAr = {0,-1,0,1};

    public int numIslands(char[][] grid) {


        int m = grid.length;
        if(m==0)
            return 0;
        int n = grid[0].length;


        boolean[][] visited = new boolean[m][n];
        int count = 0;


        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    dfs(grid,m,n,visited,i,j);
                    count++;
                }
            }
        }

        return count;

    }

    private void dfs(char[][] grid,int m,int n, boolean[][] visited,int i,int j){

        visited[i][j] = true;


        for(int x=0;x<4;x++){
            int dx = i + xAr[x];
            int dy = j + yAr[x];

            if(isSafe(dx,dy,m,n) && grid[dx][dy]=='1' && !visited[dx][dy]){
                visited[dx][dy] = true;
                dfs(grid,m,n,visited,dx,dy);
            }

        }


    }
    private boolean isSafe(int x,int y,int m,int n){

        return (x>=0 && x<m && y>=0 && y<n);


    }


}
