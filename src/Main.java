import java.util.Scanner;
import com.target_determinator.DailyTargetDeterminator;
import com.TravelDenominator.calculateDenominator;

public class Main {

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

    public static void demoCalculateDenominator() {
        int[] arr = {60,5,12,78,25};
        calculateDenominator d = new calculateDenominator(arr, 128);
        d.canMatchTargetPrice();
    }
    public static void main(String[] args) {
        // Demo of daily target program
        demoDailyTargetDeterminator();

        // Demo of traveller denominator
        demoCalculateDenominator();
    }
}