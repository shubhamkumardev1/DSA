package Arrays.Reinforcement.LEETCODE.Easy;

public class Problem121{
    public static int profit(int[] prices){
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int num : prices){
            minPrice = Math.min(num,minPrice);

            int currentPrice = num - minPrice;

            maxProfit = Math.max(maxProfit,currentPrice);
        }
        return maxProfit;
    }
    static void main() {
        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println("Maximum Profit would be here: " + profit(prices));
    }
}
