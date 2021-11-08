import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Zimi Li
 */
class StockTest {

    Stock stock = new Stock();

    @org.junit.jupiter.api.Test
    void maxProfit() {
        int[] arr = {14, 12, 70, 15, 99, 65, 21, 90};
        assertEquals(87, stock.maxProfit(arr));
    }
}