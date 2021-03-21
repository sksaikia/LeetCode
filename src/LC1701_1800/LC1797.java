package LC1701_1800;
import java.util.*;

public class LC1797 {
    class AuthenticationManager {

        //This hashMap keeps track of all the generated tokens along with their expiration time
        private HashMap<String, Integer> tokens;
        //timeToLive is the amount of time that generated token should live
        private int timeToLive;

        //Initializes the variables.
        public AuthenticationManager(int timeToLive) {
            tokens = new HashMap<>();
            this.timeToLive = timeToLive;
        }

        //This method generates a new token. It saves the tokenId and expirationTime which is currentTime+timeToLive.
        public void generate(String tokenId, int currentTime) {
            tokens.put(tokenId,currentTime+timeToLive);
        }
        //This method renews a token if that is not expired. It basically increases the expiration time.
        public void renew(String tokenId, int currentTime) {
            if(tokens.containsKey(tokenId) && tokens.get(tokenId)>currentTime){
                tokens.put(tokenId,currentTime+timeToLive);
            }
        }

        //We need to count unexpired token count. We shall remove all the invalid tokens from our hashmap. Return the count of unexpired tokens.
        public int countUnexpiredTokens(int currentTime) {
            Iterator it = tokens.entrySet().iterator();

            while (it.hasNext()) {
                Map.Entry mapElement = (Map.Entry) it.next();
                int expirationTime = (int) mapElement.getValue();


                if(expirationTime<= currentTime)
                    it.remove();

            }
            return tokens.size();
        }
    }

}
