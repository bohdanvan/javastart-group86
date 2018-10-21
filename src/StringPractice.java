/**
 * @author bvanchuhov
 */
public class StringPractice {

    public static void main(String[] args) {
        String s = "Hello, Java";

        String upperCase = s.toUpperCase();
        System.out.println(upperCase);

        int index = s.indexOf("Java");
        System.out.println(index);

        boolean startsWithHello = s.startsWith("Hello");
        System.out.println(startsWithHello);
    }
}
