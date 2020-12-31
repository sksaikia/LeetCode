package LC1_100;

public class LC79 {
    public boolean exist(char[][] board, String word) {


        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]==word.charAt(0) && dfs(board,i,j,word,0))
                    return true;
            }
        }

        return false;

    }

    private boolean dfs(char[][] board,int i,int j,String word,int count){

        if(count==word.length())
            return true;

        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]!=word.charAt(count))
            return false;


        char temp = board[i][j];

        board[i][j] = ' ';

        boolean found = dfs(board,i+1,j,word,count+1) || dfs(board,i,j+1,word,count+1)
                || dfs(board,i-1,j,word,count+1) || dfs(board,i,j-1,word,count+1);

        board[i][j] = temp;

        return found;




    }

}
