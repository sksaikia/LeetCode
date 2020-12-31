package LC101_200;

public class LC121 {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int ans = 0;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<minPrice)
                minPrice = prices[i];
            else if(prices[i]-minPrice>ans)
                ans = prices[i] - minPrice;

        }

        return ans;
    }
}
