package finalPrep;

import java.util.*;
import java.util.function.IntSupplier;

public class passowrdReset {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String commandLine = scan.nextLine();

        while (!commandLine.equals("Done")) {
            String[] data = commandLine.split(" ");
            String command = data[0];

            switch (command) {

                case "TakeOdd":

                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < input.length(); i++) {
                        if (i % 2 != 0) {
                            sb.append(input.charAt(i));
                            
                        }
                    }
                    input = sb.toString();
                    System.out.println(input);
                    break;

                case "Cut":
                    int start = Integer.parseInt(data[1]);
                    int len = Integer.parseInt(data[2]);

                    String cut = input.substring(start, start + len);
                    input = input.replace(cut, "");
                    System.out.println(input);
                    break;

                case "Substitute":
                String sub = data[1];
                String replacement = data[2];
                    if (input.contains(sub)) {
                        input = input.replace(sub, replacement);
                        System.out.println(input);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
                default:
                    throw new IllegalStateException("Unknown command " + command + " in " + commandLine);
            }

            commandLine = scan.nextLine();

        }
        System.out.println("Your password is: " + input);
    }
}
