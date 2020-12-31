package LC501_600;
import java.util.*;
public class LC567 {
    public boolean checkInclusion(String s1, String s2) {



        HashMap<Character,Integer> hashMap = new HashMap<>();

        if(s2.length()<s1.length())
            return false;

        for(char c:s1.toCharArray()){

            if(hashMap.containsKey(c))
                hashMap.put(c,hashMap.get(c)+1);
            else
                hashMap.put(c,1);

        }
        HashMap<Character,Integer> charMap = new HashMap<>();

        for (int i=0;i<s1.length();i++){
            char c = s2.charAt(i);
            if(charMap.containsKey(c))
                charMap.put(c,charMap.get(c)+1);
            else
                charMap.put(c,1);
        }

        for (int i=s1.length();i<s2.length();i++){

            if (check(hashMap,charMap))
                return true;

            char c = s2.charAt(i-s1.length());

            if (charMap.get(c)==1)
                charMap.remove(c);
            else
                charMap.put(c,charMap.get(c)-1);

            c = s2.charAt(i);
            if (charMap.containsKey(c))
                charMap.put(c,charMap.get(c)+1);
            else
                charMap.put(c,1);


        }

        if (check(hashMap,charMap))
            return true;
        return false;


    }

    private static boolean check(HashMap<Character,Integer> hashMap,
                                 HashMap<Character,Integer> currMap){


        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry mapElement = (Map.Entry) it.next();
            char c = (char) mapElement.getKey();
            int val = (int) mapElement.getValue();

            if (!currMap.containsKey(c))
                return false;
            if (val!=currMap.get(c))
                return false;

        }

        return true;
    }

}
