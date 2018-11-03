/**
 * @author bvanchuhov
 */
public class LastCharFinder {

    public static void main(String[] args) {
        System.out.println(lastChar("Hello")); // o
        System.out.println(lastChar("A")); // A
        System.out.println(lastChar(""));
    }

    public static char lastChar(String s) {
        if (s.isEmpty()) {
            throw new IllegalArgumentException("can't find last char in an empty string");
        }
        return s.charAt(s.length() - 1);
    }
}
