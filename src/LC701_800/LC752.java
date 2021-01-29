package LC701_800;
import java.util.*;
public class LC752 {
    public int openLock(String[] deadends, String target) {

        //This hashset will contain the deadend from which we can not move further.
        HashSet<String> deadend_list = new HashSet<>();

        for(String deadend:deadends)
            deadend_list.add(deadend);

        //This will keep track of all the lock orientation checked
        HashSet<String> visited = new HashSet<>();
        visited.add("0000");

        //Queue is used for BFS
        Queue<String> queue = new LinkedList<>();
        queue.add("0000");

        //THis value is out answer
        int ans = 0;

        //We run this loop until out queue is over
        while(!queue.isEmpty()){

            //We check the size of the queue. It is done to make sure that we increase the counter correctly
            int size = queue.size();

            while(size>0){

                //We poll from the queue.
                String curr_pos = queue.poll();

                //If the position is in the deadend_list, then we decrement the size and go for checking the next element in the queue.
                if(deadend_list.contains(curr_pos)){
                    size--;
                    continue;

                }

                //If curr_pos is equal to the target, we return the ans variable.
                if(curr_pos.equals(target))
                    return ans;

                //As our lock is 4 digits long, we try to change its orientation in clockwise and anticlock wise direction. If that position has not been traversed or not in the deadend list, we add that position to the visited set and add it to the queue.
                for(int i=0;i<4;i++){

                    char curr_char = curr_pos.charAt(i);

                    //clockwise direction. If we face 9 then we can change it 0 or for other characters we increment it by 1 . ie 1->2 , 5->6 , 9->0
                    String s1 = curr_pos.substring(0,i) + (curr_char=='9'? 0 : curr_char - '0' +1 ) + curr_pos.substring(i+1);

                    if(!visited.contains(s1) && !deadend_list.contains(s1)){
                        visited.add(s1);
                        queue.add(s1);
                    }


                    //anticlockwise direction. If we face a 0 then change it to 9 and for other characters we decrement it by 1. ie 2->1, 1->0,0->9
                    s1 = curr_pos.substring(0,i) + (curr_char=='0' ? 9 : curr_char-'0'-1)  + curr_pos.substring(i+1);

                    if(!visited.contains(s1) && !deadend_list.contains(s1)){
                        visited.add(s1);
                        queue.add(s1);
                    }

                }
                size--;

            }

            ans++;

        }

        //If we come out of this loop, that means that we can not go to the target lock orientation , hence return -1
        return -1;

    }
}