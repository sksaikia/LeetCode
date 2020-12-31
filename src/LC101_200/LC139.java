package LC101_200;
import java.util.*;
public class LC139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> hashSet =  new HashSet<>();

        for(String c:wordDict)
            hashSet.add(c);

        HashMap<String,Boolean> hashMap = new HashMap<>();

        return dfs(s,hashSet,hashMap);


    }

    private boolean dfs(String s,HashSet<String> hashSet,HashMap<String,Boolean> hashMap){

        if(s.isEmpty() || s.equals(""))
            return true;

        if(hashMap.containsKey(s))
            return hashMap.get(s);


        for(int i=1;i<=s.length();i++){

            if(hashSet.contains(s.substring(0,i)) && dfs(s.substring(i,s.length()) , hashSet , hashMap)){

                hashMap.put(s.substring(0,i),true);
                return true;

            }

        }


        hashMap.put(s,false);
        return false;

    }

}
