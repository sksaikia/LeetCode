package LC601_700;

public class LC693 {
    public boolean hasAlternatingBits(int n) {

        int last =-1;
        while(n>0){

            int x = n&1;
            System.out.print(x + " ");

            if(last==-1)
                last = x;
            else{

                if(x==last)
                    return false;

                last = x;

            }
            n = n>>1;

        }

        return true;
    }
}
