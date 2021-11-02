import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Zimi Li
 */
class RPSTest {

    RPS instance = new RPS();

    @org.junit.jupiter.api.Test
    void rps() {
        assertEquals("Player 2 wins", instance.rps("rock", "paper"));
        assertEquals("Player 2 wins", instance.rps("paper", "scissors"));
        assertEquals("Player 1 wins", instance.rps("paper", "rock"));
        assertEquals("Player 1 wins", instance.rps("scissors", "paper"));
        assertEquals("TIE", instance.rps("scissors", "scissors"));
    }
}