package LC401_500;
import java.util.*;
public class LC438 {
    public List<Integer> findAnagrams(String s, String p) {

        if(s.length()<p.length())
            return new ArrayList<Integer>();

        HashMap<Character,Integer> hashMap = new HashMap<>();
        HashMap<Character,Integer> charMap = new HashMap<>();


        for(char c:p.toCharArray()){
            if(hashMap.containsKey(c))
                hashMap.put(c,hashMap.get(c)+1);
            else
                hashMap.put(c,1);
        }


        List<Integer> list = new ArrayList<>();

        for(int i=0;i<p.length();i++){
            char c = s.charAt(i);

            if(charMap.containsKey(c))
                charMap.put(c,charMap.get(c)+1);
            else
                charMap.put(c,1);


        }

        for(int i=p.length();i<s.length();i++){

            if(check(hashMap,charMap)){
                list.add(i-p.length());
            }
            char prev = s.charAt(i-p.length());

            if (charMap.get(prev)==1)
                charMap.remove(prev);
            else
                charMap.put(prev,charMap.get(prev)-1);


            char curr = s.charAt(i);
            if (charMap.containsKey(curr))
                charMap.put(curr,charMap.get(curr)+1);
            else
                charMap.put(curr,1);





        }

        if(check(hashMap,charMap))
            list.add(s.length()-p.length());


        return list;

    }

    private boolean check(HashMap<Character,Integer> hashMap,HashMap<Character,Integer> charMap){

        Iterator it = hashMap.entrySet().iterator();

        while(it.hasNext()){

            Map.Entry mapElement = (Map.Entry) it.next();
            char key = (char) mapElement.getKey();
            int value = (int) mapElement.getValue();


            if(charMap.containsKey(key)){
                if(value!=charMap.get(key).intValue())
                    return false;
            }else
                return false;

        }


        return true;
    }


}
