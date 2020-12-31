package LC1_100;

public class LC7 {
    public int reverse(int x) {

        boolean state = true;
        if(x<0)
            state = false;

        long res = Math.abs(x);
        long ans = 0;

        while(res>0){
            int y = (int) res % 10;

            ans = ans*10 + y;
            res = res/10;

        }

        if(ans>Integer.MAX_VALUE)
            return 0;


        if(state==false)
            return (int) ans*(-1);
        return (int) ans;


    }
}
