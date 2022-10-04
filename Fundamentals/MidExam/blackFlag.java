package MidExam;

import java.util.*;

public class blackFlag {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        int daylyPlunder = Integer.parseInt(scan.nextLine());
        double expected = Double.parseDouble(scan.nextLine());
        double sum = 0.0;

        for (int i = 1; i <= days; i++) {

            double daily = daylyPlunder;
            if (i % 3 == 0) {
                daily *= 1.5;
            }
            sum += daily;
            if (i % 5 == 0) {
                sum = sum * 0.7;
            }

        }

        if (sum >= expected) {
            System.out.printf("Ahoy! %.2f plunder gained.", sum);
        } else {
            double percentage = sum / expected * 100.0;
            System.out.printf("Collected only %.2f%% of the plunder.", percentage);

        }

    }
}
