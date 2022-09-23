package List;

import java.util.*;
import java.util.stream.Collectors;

public class listOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scan.nextLine();
        while (!input.equals("End")) {
            String[] commandList = input.split(" ");
            String command = commandList[0];

            switch (command) {
                case "Add":
                    int numAdd = Integer.parseInt(commandList[1]);
                    numbers.add(numAdd);
                    break;
                case "Insert":
                    int number = Integer.parseInt(commandList[1]);
                    int possitionInsert = Integer.parseInt(commandList[2]);
                    if (possitionInsert < 0 || possitionInsert >= numbers.size()) {
                        System.out.println("Invalid index");

                    } else {
                        numbers.add(possitionInsert, number);
                    }
                    break;
                case "Remove":
                    int possition = Integer.parseInt(commandList[1]);
                    if (possition < 0 || possition >= numbers.size()) {
                        System.out.println("Invalid index");

                    } else {
                    numbers.remove(possition);
                    }
                    break;
                case "Shift":
                    if (commandList[1].contains("left")) {
                        int count = Integer.parseInt(commandList[2]);
                        for (int i = 0; i < count; i++) {
                            numbers.add(numbers.get(0));
                            numbers.remove(0);
                        }
                    } else {
                        int count = Integer.parseInt(commandList[2]);
                        for (int i = 0; i < count; i++) {
                            numbers.add(0, numbers.get(numbers.size() - 1));
                            numbers.remove(numbers.size() - 1);
                        }
                    }

                    break;

            }

            input = scan.nextLine();
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
