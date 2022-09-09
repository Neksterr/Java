
import java.util.*;

public class DayWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        int day = Integer.parseInt(scan.nextLine());
        if (day >= 1 && day <= 7) {
            System.out.println(days[day - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }

}
