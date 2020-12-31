package LC1_100;

public class LC74 {
    public boolean searchMatrix(int[][] mat, int k) {

        int m = mat.length;
        if(m==0)
            return false;

        int n = mat[0].length;


        int i=0,j=n-1;

        while(i<m && j>=0){

            if(mat[i][j]==k)
                return true;
            if(mat[i][j]>k)
                j--;
            else
                i++;
        }




        return false;


    }
}
