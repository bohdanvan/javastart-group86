import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayFiller {

    public static void main(String[] args) {
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) { // fori
            array[i] = 1;
        }

        System.out.println(Arrays.toString(array));
    }
}
