package MidExam;

import java.util.*;

public class bonusSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int students = Integer.parseInt(scan.nextLine());
        int lectures = Integer.parseInt(scan.nextLine());
        double bonus = Double.parseDouble(scan.nextLine());
        double attendance = 0;
        double max = 0;
        double totalBonus = 0;
        double maxAttendance = 0;
        while (students > 0) {
            attendance = Double.parseDouble(scan.nextLine());
            totalBonus = (attendance / lectures) * (5 + bonus);
            if (totalBonus > max) {
                max = totalBonus;
                maxAttendance = attendance;
            }
            students--;
        }
        System.out.printf("Max Bonus: %.0f.\n", Math.ceil(max));
        System.out.printf("The student has attended %.0f lectures.", maxAttendance);

    }
}
