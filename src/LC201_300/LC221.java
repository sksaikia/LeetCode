package LC201_300;

public class LC221 {
    public int maximalSquare(char[][] mat) {

        int m = mat.length;
        if(m==0)
            return 0;

        int n = mat[0].length;

        int ans = 0;

        int[][] x = new int[m][n];


        for(int i=0;i<m;i++){
            if(mat[i][0]=='1'){
                x[i][0] = 1;
                ans = Math.max(ans,x[i][0]);
            }
        }

        for(int i=0;i<n;i++){
            if(mat[0][i]=='1'){
                x[0][i] = 1;
                ans = Math.max(ans,x[0][i]);
            }
        }


        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(mat[i][j]=='1'){
                    x[i][j] = 1 + Math.min(x[i-1][j],Math.min(x[i-1][j-1],x[i][j-1]));
                    ans = Math.max(x[i][j],ans);
                }
            }
        }

        return ans*ans;
    }
}

