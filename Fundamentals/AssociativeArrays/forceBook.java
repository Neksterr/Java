package AssociativeArrays;

import java.util.*;

public class forceBook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, List<String>> forceMap = new LinkedHashMap<>();

        String input = scan.nextLine();

        while (!input.equals("Lumpawaroo")) {

            if (input.contains("|")) {
                String forceSide = input.split("\\s+\\|\\s+")[0];
                String forceUser = input.split("\\s+\\|\\s+")[1];
                if (!forceMap.containsKey(forceSide)) {
                    forceMap.put(forceSide, new ArrayList<>());
                    forceMap.get(forceSide).add(forceUser);
                } else {
                    Boolean exist = false;
                    for (List<String> list : forceMap.values()) {

                        if (list.contains(forceUser)) {
                            exist = true;
                        }

                    }
                    if (!exist) {
                        forceMap.get(forceSide).add(forceUser);
                    }

                }

            } else if (input.contains("->")) {
                String forceUser = input.split("\\s+->\\s+")[0];
                String forceSide = input.split("\\s+->\\s+")[1];
                forceMap.entrySet().forEach(entry -> entry.getValue().remove(forceUser));
                forceMap.putIfAbsent(forceSide, new ArrayList<>());

                forceMap.get(forceSide).add(forceUser);
                System.out.printf("%s joins the %s side!%n", forceUser, forceSide);
            }

            input = scan.nextLine();
        }

        forceMap.entrySet().stream().filter(entry -> entry.getValue().size() > 0).sorted((e1, e2) -> {
            int sortedResult = Integer.compare(e2.getValue().size(), e1.getValue().size());
            if (sortedResult == 0) {
                sortedResult = e1.getKey().compareTo(e2.getKey());
               
            }
            return sortedResult;
        }).forEach(entry -> {
            System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
            entry.getValue().stream().sorted().forEach(user -> System.out.println("! " + user));
        });

    }
}
