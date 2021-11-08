import java.util.Arrays;

/**
 * @author Zimi Li
 */
public class GCD {
    public int gcdAll(int[] nums) {
        return Arrays.stream(nums).reduce(nums[0], this::gcd);
    }

    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
