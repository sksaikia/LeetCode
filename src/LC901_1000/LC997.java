package LC901_1000;

public class LC997 {
    public int findJudge(int N, int[][] trust) {

        int[] out = new int[N];
        int[] in = new int[N];

        for(int i=0;i<trust.length;i++){
            out[trust[i][0]-1]++;
            in[trust[i][1]-1]++;

        }


        for(int i=0;i<N;i++){
            if(in[i]==N-1 && out[i]==0)
                return i+1;
        }

        return -1;


    }
}
