package LC801_900;
import java.util.*;
public class LC846 {
    public boolean isNStraightHand(int[] hand, int W) {

        if(hand.length%W!=0)
            return false;

        TreeMap<Integer,Integer> treeMap = new TreeMap<>();


        for(int i=0;i<hand.length;i++){

            int x = hand[i];

            if(treeMap.containsKey(x))
                treeMap.put(x,treeMap.get(x)+1);
            else
                treeMap.put(x,1);


        }

        while(treeMap.size()>0){

            int lowest = treeMap.firstKey();

            for(int i=lowest;i<lowest+W;i++){
                if(!treeMap.containsKey(i))
                    return false;

                int count = treeMap.get(i);
                if(count==1)
                    treeMap.remove(i);
                else
                    treeMap.put(i,count-1);

            }
        }
        return true;
    }
}
