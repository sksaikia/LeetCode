package LC801_900;
import java.util.*;
public class LC819 {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> hashSet = new HashSet<>();

        for(String c:banned)
            hashSet.add(c);

        String[] ar = paragraph.toLowerCase().split("\\W+");

        HashMap<String,Integer> hashMap = new HashMap<>();

        for(String word : ar){

            if(!hashSet.contains(word)){

                if(!hashMap.containsKey(word))
                    hashMap.put(word,1);
                else
                    hashMap.put(word,hashMap.get(word)+1);

            }

        }

        int max = 0 ;
        String ans = "";

        for(String word:hashMap.keySet()){

            if(hashMap.get(word)>max){
                ans = word;
                max = hashMap.get(word);
            }

        }

        return ans;

    }
}
