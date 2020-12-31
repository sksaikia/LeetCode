package LC101_200;

public class LC130 {
    public void solve(char[][] board) {

        int r = board.length;
        if(r==0)
            return ;
        int c = board[0].length;
        if(c==0)
            return ;

        for(int i=0;i<r;i++){


            if(board[i][0]=='O')
                boundary(board,i,0,r,c);

            if(board[i][c-1]=='O')
                boundary(board,i,c-1,r,c);

        }

        for(int i=0;i<c;i++){

            if(board[0][i]=='O')
                boundary(board,0,i,r,c);

            if(board[r-1][i]=='O')
                boundary(board,r-1,i,r,c);


        }


        for(int i=0;i<r;i++){
            for(int j =0;j<c;j++){
                if(board[i][j]=='*')
                    board[i][j] = 'O';
                else if(board[i][j] == 'O')
                    board[i][j] = 'X';

            }
        }







    }

    int[] xAr = {1,0,-1,0};
    int[] yAr = {0,-1,0,1};


    private void boundary(char[][] board,int i,int j,int m,int n){

        board[i][j] = '*';

        for(int x=0;x<4;x++){

            int dx = i + xAr[x];
            int dy = j + yAr[x];


            if(isSafe(dx,dy,m,n) && board[dx][dy]=='O'){
                boundary(board,dx,dy,m,n);
            }


        }



    }
    private boolean isSafe(int x,int y , int m,int n){
        return (x>=0 && x<m && y>=0 && y<n);
    }

}
