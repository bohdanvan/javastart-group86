/**
 * @author bvanchuhov
 */
public class BooleanExample {

    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;

        int x = 10;
        boolean b3 = x > 5;

        System.out.println("b1 = " + b1); // T
        System.out.println("b2 = " + b2); // F
        System.out.println("b3 = " + b3); // T

        System.out.println(x > 5); // T
        System.out.println(x >= 10); // T
        System.out.println(x < 10); // F
        System.out.println(x <= 5); // F
        System.out.println(x == 5); // F
        System.out.println(x != 5); // T
    }
}
