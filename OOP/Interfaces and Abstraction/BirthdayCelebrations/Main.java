package OOP.InterfacesAndAbstraction.BirthdayCelebrations;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        List<Birthable> beings = new ArrayList<>();
        while (!input.equals("End")) {
            String[] commandParts = input.split("\\s+");
            String object = commandParts[0];

            switch (object) {
                case "Citizen":
                    Birthable citizen = new Citizen(commandParts[1], Integer.parseInt(commandParts[2]), commandParts[3], commandParts[4]);
                    beings.add(citizen);
                    break;
                case "Pet":
                    Birthable pet = new Pet(commandParts[1], commandParts[2]);
                    beings.add(pet);
                    break;
                case "Robot":
                    Identifiable robot = new Robot(commandParts[2], commandParts[1]);
                    break;
            }
            input = scan.nextLine();
        }
        String yearOfBirth = scan.nextLine();

        beings.stream().map(Birthable::getBirthDate).filter(birthDate -> birthDate.endsWith(yearOfBirth)).forEach(System.out::println);
    }
}
