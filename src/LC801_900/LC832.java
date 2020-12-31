package LC801_900;

public class LC832 {
    public int[][] flipAndInvertImage(int[][] mat) {
        int m = mat.length;
        if (m==0)
            return mat;
        int n = mat[0].length;
        if (n==0)
            return mat;

        for (int i=0;i<m;i++){
            for (int j=0;j<(n/2);j++){
                int temp = mat[i][j];
                mat[i][j] = mat[i][n-j-1];
                mat[i][n-j-1] = temp;
            }
        }



        for (int i=0;i<m;i++){
            for (int j=-0;j<n;j++){
                if (mat[i][j]==1)
                    mat[i][j] = 0;
                else
                    mat[i][j] = 1;

            }
        }

        return mat;

    }
}
