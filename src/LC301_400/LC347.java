package LC301_400;
import java.util.*;
public class LC347 {
    public List<Integer> topKFrequent(int[] nums, int k) {

        int n = nums.length;

        List<Integer> ans = new ArrayList<>();

        if(n==0)
            return ans;

        PriorityQueue<Node> pQueue = new PriorityQueue<>(n,new Node());
        HashMap<Integer,Integer> hashMap = new HashMap<>();


        for(int i=0;i<n;i++){

            if(hashMap.containsKey(nums[i]))
                hashMap.put(nums[i],hashMap.get(nums[i])+1);
            else
                hashMap.put(nums[i],1);

        }


        Iterator hm = hashMap.entrySet().iterator();
        while(hm.hasNext()){

            Map.Entry mapElement = (Map.Entry) hm.next();
            int key = (int) mapElement.getKey();
            int value = (int) mapElement.getValue();

            pQueue.add(new Node(key,value));


        }


        while(!pQueue.isEmpty() && k>0){
            k--;
            ans.add(pQueue.poll().no);
        }

        return ans;




    }

    public static class Node implements Comparator<Node>{


        public int no;
        public int freq;

        public Node(){

        }


        public Node(int no,int freq){
            this.no = no;
            this.freq = freq;
        }


        @Override
        public int compare(Node n1,Node n2){

            if(n1.freq<n2.freq)
                return 1;
            else if(n1.freq>n2.freq)
                return -1;
            return 0 ;

        }



    }

}
