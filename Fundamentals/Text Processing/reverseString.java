import java.util.Scanner;

public class ReverseStrings_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        while (!line.equals("end")) {
            System.out.printf("%s = %s%n", line, reverse(line));
            line = scanner.nextLine();
        }

    }

    private static String reverse(String line) {
        String reversed = "";

        for (int i = line.length() - 1; i >= 0; i--) {
            reversed += line.charAt(i);
        }
        return reversed;
    }
}
