package MarchLeetcodeChallenge2021;

import java.util.HashSet;

public class ShortEncodingOfWords {
    public int minimumLengthEncoding(String[] words) {
        //To store the words
        HashSet<String> hashSet = new HashSet<>();

        //storing the words
        for(String word:words){
            hashSet.add(word);
        }

        for(String word:words){
            //Find the substrings of each word
            for(int k=1;k<word.length();k++){
                //If that substring is present in the hashset,we remove it. (To remove duplication)
                if(hashSet.contains(word.substring(k)))
                    hashSet.remove(word.substring(k));
            }
        }


        int ans=0;
        //Add the words to the answer and a #. ie. word length + 1 as we only need the length of the output string
        for(String word: hashSet){
            ans += word.length() + 1;
        }

        return ans;



    }
}
