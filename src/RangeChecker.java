/**
 * @author bvanchuhov
 */
public class RangeChecker {

    public static void main(String[] args) {
        int n = 201;

        boolean isInRange = n >= 100 && n <= 200;
//        boolean isNotInRange = !isInRange;
        boolean isNotInRange = n < 100 || n > 200;

        System.out.println("isInRange = " + isInRange);
        System.out.println("isNotInRange = " + isNotInRange);
    }
}
