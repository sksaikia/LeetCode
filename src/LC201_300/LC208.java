package LC201_300;

public class LC208 {
    class TrieNode {

        boolean endOfWord;
        TrieNode[] children;

        public TrieNode(){
            children = new TrieNode[26];
            endOfWord = false;
        }


    }

    TrieNode root;


    /** Initialize your data structure here. */
    public LC208() {
        root = new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {

        TrieNode curr = root;

        for(char c:word.toCharArray()){

            if(curr.children[c-'a']==null)
                curr.children[c-'a'] = new TrieNode();

            curr = curr.children[c-'a'];


        }

        curr.endOfWord = true;


    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        if(word==null || word.length()==0)
            return false;

        TrieNode curr = root;

        for(char c:word.toCharArray()){

            if(curr.children[c-'a']==null)
                return false;

            curr = curr.children[c-'a'];

        }

        return curr.endOfWord;


    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {

        if(prefix==null || prefix.length()==0)
            return false;

        TrieNode curr = root;

        for(char c:prefix.toCharArray()){

            if(curr.children[c-'a']==null)
                return false;

            curr = curr.children[c-'a'];

        }


        return true;
    }
}
