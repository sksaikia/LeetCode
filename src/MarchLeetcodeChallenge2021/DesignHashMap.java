package MarchLeetcodeChallenge2021;

import java.util.Arrays;

public class DesignHashMap {

        int[] map;

        //Initialization of the hashmap
        public DesignHashMap() {
            map = new int[1000001];
            //fill the array as -1
            Arrays.fill(map,-1);
        }

        //Given the index "key" we put the value at the index of the map array
        public void put(int key, int value) {
            map[key] = value;
        }

        //Return the value at that particular index. If the key is empty we will return -1.(filled the array with -1 at the beginning)

        public int get(int key) {
            return map[key];
        }
        //To remove an key,simply put -1 at that index
        public void remove(int key) {
            map[key] = -1;
        }

}
