package methods;

import java.util.*;

public class greaterNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();

        switch (type) {
            case "int":
                String first = scan.nextLine();
                String second = scan.nextLine();
                System.out.println(getInt(first, second));
                break;
            case "string":
                String firstStr = scan.nextLine();
                String secondStr = scan.nextLine();
                System.out.println(getMaxString(firstStr, secondStr));
                break;
            case "char":
                char firstChar = scan.next().charAt(0);
                char secondChar = scan.next().charAt(0);
                System.out.println(getChar(firstChar, secondChar));
                break;

        }

    }

    public static String getMaxString(String first, String second) {
        String result = "";
        if (first.compareTo(second) >= 0) {
            result = first;
        } else {
            result = second;
        }
        return result;
    }

    public static int getInt(String first, String second) {
        int result = Math.max(Integer.parseInt(first), Integer.parseInt(second));
        return result;

    }

    public static char getChar(char first, char second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }
}
