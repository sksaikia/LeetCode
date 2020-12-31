package LC201_300;
import java.util.*;
public class LC290 {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character,String> hashMap = new HashMap<>();

        String[] ar = str.split(" ");

        if(pattern.length()!=ar.length)
            return false;

        for(int i=0;i<pattern.length();i++){

            char ch = pattern.charAt(i);

            if(hashMap.containsKey(ch)){

                if(hashMap.get(ch).equals(ar[i])){

                }else
                    return false;

            }else{
                if(hashMap.containsValue(ar[i]))
                    return false;
                hashMap.put(ch,ar[i]);
            }


        }
        return true;

    }
}
