
/**
 * @author bvanchuhov
 */
public class MethodExample {

    public static void main(String[] args) {
        int x = min(10, 20); // 10
        int y = min(40, 20); // 20
        System.out.println("x = " + x + ", y = " + y);

        int a = Math.min(10, 20);
    }

    public static int min(int a, int b) {
        int min;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        return min;
    }
}
