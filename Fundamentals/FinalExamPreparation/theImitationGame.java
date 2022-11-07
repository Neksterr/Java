package finalPrep;

import java.util.*;

public class imitationGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String message = scan.nextLine();
        String commandLine = scan.nextLine();

        while (!commandLine.equals("Decode")) {
            String[] data = commandLine.split("\\|");
            String command = data[0];

            switch (command) {

                case "Move":
                    int num = Integer.parseInt(data[1]);
                    String first = message.substring(0, num );
                    String second = message.substring(num );

                    message = second + first;
                    break;

                case "Insert":
                    int index = Integer.parseInt(data[1]);
                    String value = data[2];
                    String firstHalf = message.substring(0, index);
                    String secondHalf = message.substring(index);
                    message = firstHalf + value + secondHalf;
                    break;

                case "ChangeAll":
                    String replaceSub = data[1];
                    String replacement = data[2];
                    message = message.replace(replaceSub, replacement);
                    break;
                    default:
                    throw new IllegalStateException("Unknown command " + command + " in " + commandLine);
            }

            commandLine = scan.nextLine();
        }
        System.out.println("The decrypted message is: " + message);
    }
}
