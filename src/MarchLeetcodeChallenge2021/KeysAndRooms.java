package MarchLeetcodeChallenge2021;

import java.util.*;

public class KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();

        //Hashset to keep count of visited rooms
        HashSet<Integer> hashSet = new HashSet<>();

        //We entered the room 0
        hashSet.add(0);

        //Queue is used for breath-first-search
        Queue<Integer> queue = new LinkedList<>();

        //Entered 0-th room
        queue.add(0);


        while(!queue.isEmpty()){

            //Get the current room.
            int curr = queue.poll();

            Iterator it = rooms.get(curr).listIterator();

            //Check for the keys availble in that room
            while(it.hasNext()){

                int x = (int) it.next();

                //If not visited, put that in the hashset and queue.
                if(!hashSet.contains(x)){
                    hashSet.add(x);
                    queue.add(x);
                }


            }



        }
        //If the size of the hashset is equal to the number of rooms
        if(hashSet.size()==n)
            return true;
        return false;


    }
}
