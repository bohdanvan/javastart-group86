/**
 * @author bvanchuhov
 */
public class IntegerType {

    public static void main(String[] args) {
        int age = 25;

        age = age + 10; // 35
        age += 10; // 45

        // Increment
        age = age + 1;
        age += 1;
        age++;
        ++age;

        // Decrement
        --age;
        age--;

        System.out.println(age);
    }
}
