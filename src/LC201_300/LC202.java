package LC201_300;

import java.util.HashSet;

public class LC202 {

    static HashSet<Integer> hashSet;
    public boolean isHappy(int n) {


        //Dry run of example 1
        // 19 -> 1+81 = 82 -> 64+ 4 = 68 -> 36 + 64 = 100 -> 1 . As we reach 1, we need to return 1.

        //Dry run of example 2
        // 2 -> 4 -> 16 -> 1+36 = 37 -> 9 + 49 = 58 -> 25 + 64 = 89 -> 64+81 = 145 -> 1 + 16+25 = 42 -> 16+4 = 20 -> 4 .
        //  So here we can see that we are looping through same numbers in this case . Therefore we should jump out of this loop.

        hashSet = new HashSet<>();
        return isHappyUtil(n);


    }

    private boolean isHappyUtil(int n){

        if(n==1)
            return true;

        int sum = 0;


        while(n>0){

            int x = n%10;
            sum = sum + (int) Math.pow(x,2);
            n = n/10;

        }

        if(hashSet.contains(sum))
            return false;

        hashSet.add(sum);

        return isHappyUtil(sum);


    }
}
