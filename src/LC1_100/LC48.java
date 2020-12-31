package LC1_100;

public class LC48 {
    public void rotate(int[][] mat) {
        int N = mat.length;

        for(int i=0;i<N/2;i++){
            for(int j= i ;j<N-1-i;j++){

                int temp = mat[i][j];
                mat[i][j] = mat[N-j-1][i];
                mat[N-j-1][i] = mat[N-1-i][N-1-j];
                mat[N-1-i][N-1-j] = mat[j][N-1-i];
                mat[j][N-1-i] = temp;


            }
        }

    }
}
