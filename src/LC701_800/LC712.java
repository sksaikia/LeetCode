package LC701_800;

public class LC712 {
    public int minimumDeleteSum(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        int[][] count = new int[m+1][n+1];


        for(int i=1;i<=m;i++)
            count[i][0] = count[i-1][0] + s1.charAt(i-1);

        for(int i=1;i<=n;i++)
            count[0][i] = count[0][i-1] + s2.charAt(i-1);


        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){

                if(s1.charAt(i-1)==s2.charAt(j-1))
                    count[i][j] = count[i-1][j-1];
                else
                    count[i][j] = Math.min(count[i-1][j]+s1.charAt(i-1) , count[i][j-1] + s2.charAt(j-1));

            }
        }

        return count[m][n];


    }
}
