package LC1201_1300;

public class LC1232 {
    public boolean checkStraightLine(int[][] ar) {


        if(ar.length==2)
            return true;


        for(int i=1;i<ar.length-1;i++){


            int x1 = ar[i-1][0];
            int y1 = ar[i-1][1];
            int x2 = ar[i][0];
            int y2 = ar[i][1];
            int x3 = ar[i+1][0];
            int y3 = ar[i+1][1];

            int a = (y2-y1) * (x3-x2);
            int b = (y3-y2) * (x2-x1);

            if(a!=b)
                return false;


        }

        return true;


    }
}
