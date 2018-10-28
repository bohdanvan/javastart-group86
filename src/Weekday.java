import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class Weekday {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day (1..7): ");
        int day = scanner.nextInt();

        String dayType = (day <= 5) ? "weekday" : "weekend";

//        String dayType;
//        if (day <= 5) {
//            dayType = "weekday";
//        } else {
//            dayType = "weekend";
//        }

        System.out.println(dayType);
    }
}
