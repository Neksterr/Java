package setsAndMapsAdv;

import java.util.*;

public class userLogs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        Map<String, LinkedHashMap<String, Integer>> userMap = new TreeMap<>();
        while (!input.equals("end")) {
            String[] data = input.split(" ");
            String ipParts = data[0];
            String usernameParts = data[2];
            String userName = usernameParts.substring(5);
            String ipAddress = ipParts.substring(3);

            userMap.putIfAbsent(userName, new LinkedHashMap<>());
            userMap.get(userName).putIfAbsent(ipAddress, 0);
            userMap.get(userName).put(ipAddress, userMap.get(userName).get(ipAddress) + 1);

            input = scan.nextLine();
        }
        userMap.forEach((k, v) -> {
            System.out.println(k + ":");
            StringBuilder sb = new StringBuilder();

            v.forEach((i, c) -> {
                String output = String.format("%s => %s, ", i, c);

                sb.append(output);
            });
            String finalOutput = sb.substring(0, sb.length() - 2);
            finalOutput = finalOutput + ".";
            System.out.println(finalOutput);

        });
    }
}
