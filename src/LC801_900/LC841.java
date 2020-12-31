package LC801_900;
import java.util.*;
public class LC841 {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();

        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(0);


        Queue<Integer> queue = new LinkedList<>();


        queue.add(0);


        while(!queue.isEmpty()){

            int curr = queue.poll();

            Iterator it = rooms.get(curr).listIterator();

            while(it.hasNext()){

                int x = (int) it.next();

                if(!hashSet.contains(x)){
                    hashSet.add(x);
                    queue.add(x);
                }


            }



        }
        if(hashSet.size()==n)
            return true;
        return false;


    }
}
