package LC101_200;
import java.util.*;
public class LC146 {
    Node head = new Node();
    Node tail = new Node();

    HashMap<Integer,Node> hashMap;

    int cache_capacity;

    public LC146(int capacity) {
        cache_capacity = capacity;
        hashMap = new HashMap<>();
        head.next = tail;
        tail.prev = head;

    }

    public int get(int key) {
        int result = -1;

        Node node = hashMap.get(key);

        if(node!=null){

            result = node.val;
            remove(node);
            add(node);
        }


        return result;
    }

    public void put(int key, int value) {

        Node currNode = hashMap.get(key);

        if(currNode!=null){

            remove(currNode);
            currNode.val = value;
            add(currNode);

        } else{

            if(hashMap.size()==cache_capacity){
                hashMap.remove(tail.prev.key);
                remove(tail.prev);
            }

            Node newNode = new Node();
            newNode.val = value;
            newNode.key = key;

            hashMap.put(key,newNode);
            add(newNode);



        }


    }

    public void add(Node node){

        Node head_next = head.next;
        node.next = head_next;
        head_next.prev = node;
        head.next = node;
        node.prev = head;

    }

    public void remove(Node node){

        Node next_node = node.next;
        Node prev_node = node.prev;

        prev_node.next = next_node;
        next_node.prev = prev_node;

    }

    class Node {

        int key;
        int val;

        Node prev,next;

    }
}
