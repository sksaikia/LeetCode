package LC1101_1200;

public class LC1184 {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {

        int clock = 0;
        int anti = 0;
        int n = distance.length;


        int x = start;
        int y = destination;
        //  System.out.println("YESSSS");

        while(y!=x){

            anti += distance[y];
            y = (y+1)%(n);

        }
        x = start;
        y = destination;

        while (x!=y){

            clock += distance[x];
            x = (x+1) % (n);
        }



        return Math.min(clock,anti);




    }
}
