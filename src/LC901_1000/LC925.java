package LC901_1000;

public class LC925 {
    public boolean isLongPressedName(String name, String typed) {

        int small = 0;
        int big = 0 ;


        while(small<name.length() && big<typed.length()){

            if(name.charAt(small)==typed.charAt(big)){
                small++;
                big++;

            }else
                big++;




        }


        if(small>name.length()-1)
            return true;
        return false;

    }
}
