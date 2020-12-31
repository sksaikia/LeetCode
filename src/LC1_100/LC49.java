package LC1_100;
import java.util.*;
public class LC49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();

        HashMap<String,List<String>> hashMap = new HashMap<>();

        for(String c:strs){

            char[] ar = c.toCharArray();
            Arrays.sort(ar);
            String curr = new String(ar);

            if(!hashMap.containsKey(curr))
                hashMap.put(curr,new ArrayList<>());

            hashMap.get(curr).add(c);

        }

        ans.addAll(hashMap.values());
        return ans;

    }
}
