/**
 * @author bvanchuhov
 */
public class RangeSum {

    public static void main(String[] args) {
        System.out.println(rangeSum(5, 7)); // 18
        System.out.println(rangeSum(-10, 10)); // 0
        System.out.println(rangeSum(1, 100)); // 5050
    }

    public static int rangeSum(int from, int to) {
        if (from > to) {
            throw new IllegalArgumentException("from > to");
        }
        int sum = 0;
        for (int n = from; n <= to; n++) {
            sum += n;
        }
        return sum;
    }
}
