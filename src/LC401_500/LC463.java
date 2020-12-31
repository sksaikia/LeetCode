package LC401_500;

public class LC463 {
    public int islandPerimeter(int[][] grid) {

        int count = 0;

        int m = grid.length;

        if(m==0)
            return 0;

        int n = grid[0].length;

        if(n==0)
            return 0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    count += 4;
                    if(i>0  && grid[i-1][j]==1)
                        count -= 2;
                    if(j>0 && grid[i][j-1]==1)
                        count -=2;
                }
            }
        }

        return count;


    }
}
