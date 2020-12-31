package LC401_500;

public class LC459 {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();

        for(int i=len/2;i>=1;i--){

            if(len%i==0){

                int repeats = len/i;

                String str = s.substring(0,i);

                if(str.repeat(repeats).equals(s))
                    return true;


            }


        }


        return false;
    }
}
