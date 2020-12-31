package LC1_100;
import java.util.*;
public class LC76 {
    public String minWindow(String s, String t) {


        if (s.length() == 0 || t.length() == 0) {
            return "";
        }
        HashMap<Character,Integer> hashPtr = new HashMap<>();
        HashMap<Character,Integer> hashStr = new HashMap<>();

        for(char c:t.toCharArray()){

            if(hashPtr.containsKey(c))
                hashPtr.put(c,hashPtr.get(c)+1);
            else
                hashPtr.put(c,1);
        }

        int l =0;
        int r = 0;
        int start = -1;
        int count = 0;

        int ans = -1;

        while(r<s.length()){

            char c = s.charAt(r);

            if(hashStr.containsKey(c))
                hashStr.put(c,hashStr.get(c)+1);
            else
                hashStr.put(c,1);

            if(hashPtr.containsKey(c) && hashPtr.get(c).intValue()==hashStr.get(c).intValue())
                count++;

            while(l<=r && count==hashPtr.size()){

                if(r-l+1<ans || ans==-1){
                    ans = r-l+1;
                    start = l;
                }
                c = s.charAt(l);
                hashStr.put(c,hashStr.get(c)-1);

                if(hashPtr.containsKey(c) && hashStr.get(c).intValue()<hashPtr.get(c).intValue())
                    count--;

                l++;
            }

            r++;

        }

        if(start==-1)
            return "";
        else
            return s.substring(start,start+ans);


    }
}
