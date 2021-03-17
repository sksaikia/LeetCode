package MarchLeetcodeChallenge2021;

import java.util.HashMap;
import java.util.Map;

public class EncodeAndDecodeTinyURL {
    //HashMap for storing the key-values pairs. It will store the hashed version of the given string
    Map<Integer,String> hashMap = new HashMap<>();
    String host = "http://tinyurl.com/";

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        //Get the equivalent hashcode for a given string
        int key = longUrl.hashCode();
        //put it in the hashmap
        hashMap.put(key,longUrl);
        //have to return like http://tinyurl/com/  + hashedvalue
        return host+key;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        //remove the http://tinyurl.com part from the given string
        String temp = shortUrl.replace(host,"");
        //Get the original value from here.
        int key = Integer.parseInt(temp);
        return hashMap.get(key);
    }
}
