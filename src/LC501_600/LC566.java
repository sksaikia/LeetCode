package LC501_600;

import java.util.ArrayList;

public class LC566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int m = nums.length;

        if(m==0)
            return nums;

        int n = nums[0].length;

        if(m*n!=r*c)
            return nums;

        int[][] mat = new int[r][c];

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                list.add(nums[i][j]);
            }
        }
        int k=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j] = list.get(k++);
            }
        }

        return mat;
    }
}
