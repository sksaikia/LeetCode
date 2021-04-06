package AprilLeetCodingChallenge2021;

public class MinimumOperationsToMakeArrayEqual {
    public int minOperations(int n) {

        int count = 0;
        for(int i=0;i<n/2;i++){
            count = count + (n - ((2*i)+1));
        }

        return count;


    }
}
