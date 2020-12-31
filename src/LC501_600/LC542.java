package LC501_600;
import java.util.*;
public class LC542 {
    public int[][] updateMatrix(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;


        int[][] ans = new int[m][n];


        Queue<Pair> queue = new LinkedList<>();


        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0)
                    queue.add(new Pair(i,j));
                else{

                    ans[i][j] = Integer.MAX_VALUE;

                }
            }
        }

        //Queue operations start here
        while(!queue.isEmpty()){

            Pair curr = queue.poll();

            for(int i=0;i<4;i++){

                int dx = curr.x + xAr[i];
                int dy = curr.y + yAr[i];


                if(isSafe(dx,dy,m,n) && ans[dx][dy]>ans[curr.x][curr.y]+1){

                    ans[dx][dy] = ans[curr.x][curr.y] + 1;

                    queue.add(new Pair(dx,dy));
                }


            }


        }


        return ans;

    }

    int[] xAr = {1,0,-1,0};
    int[] yAr = {0,-1,0,1};

    private boolean isSafe(int x,int y,int m,int n){
        return (x>=0 && x<m && y>=0 && y<n);
    }


    static class Pair {
        public int x,y;

        public Pair(int x,int y){
            this.x = x;
            this.y = y;
        }
    }


}
