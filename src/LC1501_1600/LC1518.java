package LC1501_1600;

public class LC1518 {
    static int total = 0;

    public int numWaterBottles(int numBottles, int numExchange) {
        total = 0;

        int empty = 0;
        int lastEmpty = 0;

        while (numBottles!=0){

            total += numBottles;;
            empty = numBottles+lastEmpty;
            numBottles = empty/numExchange;
            lastEmpty = empty%numExchange;

        }



        return total;
    }
}
