package methods;

import java.util.*;

public class dataTypes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();
        switch (type) {
            case "int":
                int n = Integer.parseInt(scan.nextLine());
                System.out.println(intData(n));
                break;
            case "real":
                double numReal = Double.parseDouble(scan.nextLine());
                System.out.printf("%.2f", realData(numReal));
                break;
            case "string":
                String text = scan.nextLine();
                System.out.println(stringData(text));
                break;
        }

    }

    public static int intData(int n) {
        int result = n * 2;
        return result;
    }

    public static double realData(double n) {
        double result = n * 1.5;
        return result;
    }

    public static String stringData(String text) {
        return "$" + text + "$";

    }
}
