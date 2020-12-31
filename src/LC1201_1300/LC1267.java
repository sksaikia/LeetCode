package LC1201_1300;

public class LC1267 {
    public int countServers(int[][] grid) {
        if(grid==null)
            return 0;


        int m = grid.length;
        int n = grid[0].length;


        int count = 0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){

                if(grid[i][j]==1){
                    if(neighboursExist(grid,i,j,m,n))
                        count++;

                }

            }
        }

        return count;


    }

    private boolean isValid(int[][] grid,int row,int col){

        return (row>=0 && col>=0 && row<grid.length && col<grid[0].length);

    }



    private boolean neighboursExist(int[][] grid,int row,int col,int m,int n){

        //Check for left,right,up,down

        //checking for right
        for(int i=col+1;i<n;i++){
            if( isValid(grid,row,i)) {
                if(grid[row][i]==1)
                    return true;
            }
            else
                break;
        }
        //checking for left
        for(int i=col-1;i>=0;i--){
            if(isValid(grid,row,i)){
                if(grid[row][i]==1)
                    return true;

            }else
                break;
        }

        //Checking for bottom
        for(int i=row+1;i<m;i++){
            if(isValid(grid,i,col)){
                if(grid[i][col]==1)
                    return true;
            }

            else
                break;
        }


        for(int i=row-1;i>=0;i--){

            if(isValid(grid,i,col)){
                if(grid[i][col]==1)
                    return true;
            }
            else
                break;

        }


        return false;
    }
}
