package LC1301_1400;

import java.util.*;

public class LC1380 {
    public List<Integer> luckyNumbers (int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;

        List<Integer> ans = new ArrayList<>();

        if(m==0)
            return ans;

        int row = 0;
        int col = 0;
        int min = Integer.MAX_VALUE;

        for(int i = 0 ;i<m;i++){
            min = Integer.MAX_VALUE;
            row = 0;
            col = 0;
            for(int j=0;j<n;j++){
                if(mat[i][j]<min){
                    min = mat[i][j];
                    row = i;
                    col = j;
                }
            }

            if(check(min,col,mat))
                ans.add(mat[row][col]);


        }



        return ans;
    }

    private boolean check(int min,int column,int[][] mat){

        int max = Integer.MIN_VALUE;

        for(int i=0;i<mat.length;i++){
            max = Math.max(max,mat[i][column]);
        }


        if(max==min)
            return true;
        return false;
    }

}
