/**
 * @author bvanchuhov
 */
public class Increment {

    public static void main(String[] args) {
        int x = 10;
        System.out.println(x++);
        System.out.println(x);
        System.out.println();

        int y = 10;
        System.out.println(++y);
        System.out.println(y);

        int z = 10;
        z += z++ + ++z;
        // z = z + z++ + ++z
        // z = 10 + z++ + ++z, z = 10
        // z = 10 + 10 + ++z, z = 11
        // z = 10 + 10 + 12, z = 12
        // z = 32
        System.out.println(z);
    }
}
