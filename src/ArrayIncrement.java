import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayIncrement {

    public static void main(String[] args) {
        int[] array = {10, 30, 20};

//        for (int elem : array) {
//            elem++;
//        }
        for (int i = 0; i < array.length; i++) {
            array[i]++;
        }

        System.out.println(Arrays.toString(array));
    }
}
