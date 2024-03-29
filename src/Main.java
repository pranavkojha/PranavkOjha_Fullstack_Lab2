import java.util.Scanner;
import com.target_determinator.DailyTargetDeterminator;
import com.TravelDenominator.calculateDenominator;

public class Main {

    /**
     * Method to demo daily target price match.
     */
    public static void demoDailyTargetDeterminator() {
        // Create instance of object and initialize transactions.
        Scanner sc = new Scanner(System.in);
        DailyTargetDeterminator dt = new DailyTargetDeterminator();

        // Check if daily transaction limits are met or not.
        System.out.println("Enter no. of daily targets to be met: ");
        int num = sc.nextInt();
        for(int i=0; i < num; i++) {
            System.out.println("Enter daily target to be met: ");
            int target = sc.nextInt();
            dt.dailyTargetMet(target);
        }
    }

    /**
     * Daily price target match method.
     */
    public static void demoCalculateDenominator() {
        calculateDenominator d = new calculateDenominator();
        d.canMatchTargetPrice();
    }
    public static void main(String[] args) {
        // Demo of daily target program
        demoDailyTargetDeterminator();
        System.out.println("\n+++++++++++++++++++++\n");
        // Demo of traveller denominator
        demoCalculateDenominator();
    }
}