package LC1_100;

public class LC59 {
    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        int x = 1;

        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = n-1;

        while (rowStart<=rowEnd && colStart<=colEnd){

            for (int i=colStart;i<=colEnd;i++)
                mat[rowStart][i] = x++;

            rowStart++;

            for (int i= rowStart;i<=rowEnd;i++)
                mat[i][colEnd] = x++;

            colEnd--;

            if (rowStart<=rowEnd){

                for (int i=colEnd;i>=colStart;i--)
                    mat[rowEnd][i] = x++;

            }

            rowEnd--;

            if (colStart<=colEnd){

                for (int i=rowEnd;i>=rowStart;i--)
                    mat[i][colStart] = x++;

            }

            colStart++;



        }

        return mat;

    }
}
