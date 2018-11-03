/**
 * @author bvanchuhov
 */
public class AgeChecker {

    public static void main(String[] args) {
        System.out.println(isAge(10)); // true
        System.out.println(isAge(200)); // false
        System.out.println(isAge(-1000)); // false
    }

    public static boolean isAge(int n) {
        return n >= 1 && n <= 120;
    }
}
