import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class IPhoneTask {

    public static void main(String[] args) {
        long iPhonePrice = 999;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter money: ");
        long money = scanner.nextLong();

        System.out.print("Are you happy? (yes/no) ");
        boolean isHappy = scanner.next().equals("yes");

        System.out.print("Is iPhone red? (yes/no) ");
        boolean isRedIPhone = scanner.next().equals("yes");

        if ((!isHappy || isRedIPhone) && money >= iPhonePrice) {
            System.out.println("Buy IPhone");
            money -= iPhonePrice;
        } else {
            System.out.println("Sadly :(");
        }

        System.out.println("$" + money + " left");
    }
}
