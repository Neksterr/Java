package finalPrep;

import java.util.*;

public class worldTour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String stops = scan.nextLine();

        String commandLine = scan.nextLine();

        while (!commandLine.equals("Travel")) {
            String[] data = commandLine.split(":");
            String command = data[0];

            switch (command) {
                case "Add Stop":
                    int index = Integer.parseInt(data[1]);
                    String city = data[2];

                    if (isValidIndex(index, stops)) {
                        String firstHalf = stops.substring(0, index);
                        String secondHalf = stops.substring(index);
                        stops = firstHalf + city + secondHalf;

                    }

                    break;

                case "Remove Stop":
                    int startIndex = Integer.parseInt(data[1]);
                    int endIndex = Integer.parseInt(data[2]);

                    if (isValidIndex(startIndex, stops) && isValidIndex(endIndex, stops)) {
                        String firstPart = stops.substring(0, startIndex);
                        String secondPart = stops.substring(endIndex + 1);
                        stops = firstPart + secondPart;
                    }
                    break;

                case "Switch":
                    String old = data[1];
                    String newStr = data[2];

                    String[] stopsString = stops.toString().split(old);
                    if (stops.contains(old)) {
                        stops = stops.replace(old, newStr);
                    }

                    break;

            }
            System.out.println(stops);
            commandLine = scan.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s", stops);
    }

    public static boolean isValidIndex(int index, String stops) {
       
        return index >= 0 && index < stops.length();
    }
}
