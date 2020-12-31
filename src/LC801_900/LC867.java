package LC801_900;

public class LC867 {
    public int[][] transpose(int[][] A) {
        int row = A.length;
        int col = A[0].length;

        int[][] mat = new int[col][row];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[j][i] = A[i][j];
            }
        }

        return mat;

    }

}
