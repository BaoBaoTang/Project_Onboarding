import java.util.Arrays;
import java.util.List;

/**
 * @author Zimi Li
 */
public class RPS {

    private final List<String> convert = Arrays.asList("rock", "paper", "scissors");

    public String rps(String p1, String p2) {
        int diff = (convert.indexOf(p1) - convert.indexOf(p2) + 3) % 3;
        return diff == 0 ? "TIE" : "Player " + diff + " wins";
    }
}
