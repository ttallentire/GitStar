import java.util.Scanner;
/**
 * Take a temperature and print an appropriate activity.
 * @author A008823367
 * @version 1
 */
public class Activities {
    /**
     * Fun with cascading if statements.
     * @param args unused
     */
    public static void main(String[] args) {
        int temp;
        boolean shop = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome, please enter the current Temperature");
        temp = scan.nextInt();
        
        if (temp > 95 || temp < 20) {
            shop = true;
        }
        if (temp >= 80 && !shop) {
            System.out.println("Swimming");
        } else if (temp >= 60) {
            System.out.println("Tennis");
        } else if (temp >= 40) {
            System.out.println("Golf");
        } else if (temp < 40 && !shop) {
            System.out.println("Skiing");
        }
        if (shop) {
            System.out.println("Visit our shop!");
        }
        
        scan.close();
    }
}