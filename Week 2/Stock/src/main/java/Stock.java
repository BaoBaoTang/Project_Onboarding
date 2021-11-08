/**
 * @author Zimi Li
 */
public class Stock {
    public int maxProfit(int[] prices) {
        int minimum = Integer.MAX_VALUE;
        int ret = 0;
        for (int price : prices) {
            minimum = Math.min(price, minimum);
            ret = Math.max(price - minimum, ret);
        }
        return ret;
    }
}
