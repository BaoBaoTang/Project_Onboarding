import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Zimi Li
 */
class GCDTest {

    GCD gcd = new GCD();

    @org.junit.jupiter.api.Test
    void gcdAll() {
        assertEquals(14, gcd.gcdAll(new int[]{84, 70, 42, 56}));
        assertEquals(19, gcd.gcdAll(new int[]{19, 38, 76, 133}));
        assertEquals(5, gcd.gcdAll(new int[]{120, 300, 95, 425, 625}));
    }
}