package greedy;

/**
 * leetcode 122
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/
 * 1. Greedy O(n)
 * 2. DFS O(2 ^ n)
 * 3. DP O(n)
 */
public class BestTimeBuyAndSellStock {
    public int maxProfitGreedy(int[] prices) {
        int profit = 0;

        boolean status = false; // false空仓，true持有
        int buyPrice = 0;

        for (int i = 0; i < prices.length; i++) {
            int cur = prices[i];

            if (i == prices.length - 1) {
                if (status && cur > buyPrice) {
                    profit += (cur - buyPrice);
                }
                break;
            }

            int next = prices[i + 1];
            if (status) {
                // 明天要降价卖出
                if (next < cur) {
                    profit += (cur - buyPrice);
                    status = false;
                }
            } else {
                if (next > cur) {
                    status = true;
                    buyPrice = cur;
                }
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        System.out.println(new BestTimeBuyAndSellStock().maxProfitGreedy(new int[]{1, 2, 3, 4, 5}));
        System.out.println(new BestTimeBuyAndSellStock().maxProfitGreedy(new int[]{2, 1, 4, 5, 2, 9, 7}));
    }
}
