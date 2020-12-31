package LC701_800;
import java.util.*;
public class LC752 {
    public int openLock(String[] deadends, String target) {


        HashSet<String> dead_ends = new HashSet<>();

        for (String c: deadends)
            dead_ends.add(c);


        HashSet<String> visited = new HashSet<>();
        visited.add("0000");

        Queue<String> queue = new LinkedList<>();
        queue.add("0000");

        int level = 0;

        while (!queue.isEmpty()){

            int size = queue.size();

            while (size>0){

                String curr = queue.poll();

                if (dead_ends.contains(curr)) {
                    size--;
                    continue;
                }

                if (curr.equals(target))
                    return level;

                StringBuilder str = new StringBuilder(curr);

                for (int i=0;i<4;i++) {
                    char curr_char = curr.charAt(i);

                    String s1 = str.substring(0,i) + (curr_char=='9'? 0 : curr_char - '0' +1 ) + str.substring(i+1);


                    if (!dead_ends.contains(s1) && !visited.contains(s1)) {
                        queue.add(s1);
                        visited.add(s1);
                    }


                    s1 = str.substring(0,i) + (curr_char=='0' ? 9 : curr_char-'0'-1) + str.substring(i+1);

                    if (!dead_ends.contains(s1) && !visited.contains(s1)) {
                        queue.add(s1);
                        visited.add(s1);
                    }


                }
                size--;

            }

            level++;
        }

        return -1;


    }
}
