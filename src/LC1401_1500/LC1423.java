package LC1401_1500;

public class LC1423 {


//   cardPoints  =   [1,2,3,4,5,6,1] , k=3

//     left[] = {0,1,3,6}
//     right[] = {0,1,7,12}

//     left 0 + right 3 = 0+12 = 12
//     left 1 + right 2 = 1 + 7 = 8
//     left 2 + right 1 = 3 + 1 = 4
//     left 3 + right 0 = 6 + 0 = 6


    public int maxScore(int[] cardPoints, int k) {
        int[] left = new int[k+1];
        int[] right = new int[k+1];

        int ans = 0;

        left[0] = 0;
        right[0] = 0;

        left[1] = cardPoints[0];
        right[1] = cardPoints[cardPoints.length-1];


        for(int i=1;i<=k;i++){
            left[i] = left[i-1] + cardPoints[i-1];
        }


        for(int i=1;i<=k;i++)
            right[i] = right[i-1] + cardPoints[cardPoints.length-i];



//         for(int c:left)
//             System.out.print(c + " ");

//          System.out.println();
//         for(int c:right)
//             System.out.print(c + " ");

//          System.out.println();


        for(int i=0;i<=k;i++){
            ans = Math.max(ans , left[i]+right[k-i]);
            // System.out.print(ans + " ");
        }

        return ans ;

    }
}
