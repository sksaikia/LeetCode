package LC201_300;
import java.util.*;
public class LC211 {
    class TrieNode {

        TrieNode[] children;
        boolean isWord;

        public TrieNode(){
            children = new TrieNode[26];
            isWord = false;
        }


    }

    TrieNode root;

    /** Initialize your data structure here. */
    public LC211() {
        root = new TrieNode();
    }

    /** Adds a word into the data structure. */
    public void addWord(String word) {
        TrieNode curr = root;

        for(char c:word.toCharArray()){

            int index = (int) c-'a';

            if(curr.children[index]==null)
                curr.children[index] = new TrieNode();

            curr = curr.children[index];

        }

        curr.isWord = true;

    }

    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        return find(word,root,0);
    }

    private boolean find(String word,TrieNode curr,int index){

        if(index==word.length())
            return curr.isWord;
        char c = word.charAt(index);
        if(c=='.'){

            for(int i=0;i<26;i++){

                if(curr.children[i]!=null && find(word,curr.children[i],index+1))
                    return true;


            }
            return false;


        }else{

            return curr.children[c -'a']!= null && find(word,curr.children[c-'a'],index+1);


        }

    }

}
