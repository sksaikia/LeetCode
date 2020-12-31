package LC401_500;
import java.util.*;
public class LC451 {
    public String frequencySort(String s) {

        int n = s.length();
        if(n==0)
            return "";

        PriorityQueue<Node> pQueue = new PriorityQueue<>(n,new Node());
        HashMap<Character,Integer> hashMap = new HashMap<>();

        for(int i=0;i<s.length();i++){

            char c = s.charAt(i);

            if(hashMap.containsKey(c))
                hashMap.put(c,hashMap.get(c)+1);
            else
                hashMap.put(c,1);



        }

        Iterator hm = hashMap.entrySet().iterator();

        while(hm.hasNext()){

            Map.Entry mapElement = (Map.Entry) hm.next();
            char c = (char) mapElement.getKey();
            int value = (int) mapElement.getValue();

            pQueue.add(new Node(c,value));

        }

        String ans = "";
        while(!pQueue.isEmpty()){

            Node node = pQueue.poll();

            char c = node.c;
            int value = node.freq;

            for (int i=1;i<=value;i++){
                ans += String.valueOf(c);
            }

        }
        return ans;


    }



    public  class Node implements Comparator<Node>{

        public char c;
        public int freq;

        public Node(char c,int freq){
            this.c = c;
            this.freq = freq;
        }


        public Node(){

        }


        @Override
        public int compare(Node n1,Node n2){


            if(n1.freq<n2.freq)
                return 1;
            else
                return -1;



        }





    }
}
