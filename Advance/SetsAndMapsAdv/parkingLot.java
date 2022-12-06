package setsAndMapsAdv;

import java.util.*;

public class parkingLot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        LinkedHashSet<String> carSet = new LinkedHashSet<>();
        while (!input.equals("END")) {
            String[] data = input.split(", ");
            String direction = data[0];
            String carNum = data[1];

            switch (direction) {

                case "IN":
                    carSet.add(carNum);
                    break;
                case "OUT":
                    carSet.remove(carNum);
                    break;
            }
            input = scan.nextLine();
        }
        if (carSet.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String car : carSet) {
                System.out.println(car);
            }
        }

    }
}
