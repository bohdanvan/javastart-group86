import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class WorkingWeekIf {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter day (1..7): ");
        int day = scan.nextInt();

        if (day <= 5) {
            System.out.println("Work");
            if (day >= 4) {
                System.out.println("Football");
            }
        } else {
            System.out.println("Friends");
        }

        System.out.println("Java Courses");
    }
}
