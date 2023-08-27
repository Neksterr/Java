package OOP.InterfacesAndAbstraction.FoodShortage;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOfPeople = Integer.parseInt(scan.nextLine());
        Map<String, Buyer> buyers = new HashMap<>();
        for (int i = 0; i < numOfPeople; i++) {
            String[] input = scan.nextLine().split("\\s+");
            Buyer buyer;
            if (input.length == 3) {
                buyer = new Rebel(input[0], Integer.parseInt(input[1]), input[2]);
            } else {
                buyer = new Citizen(input[0], Integer.parseInt(input[1]), input[2], input[3]);
            }
            buyers.put(input[0], buyer);
        }
        String buyerName = scan.nextLine();

        while (!"End".equals(buyerName)) {
            Buyer buyer = buyers.get(buyerName);

            if (buyer != null) {
                buyer.buyFood();
            }
            buyerName = scan.nextLine();
        }
        int totalFood = buyers.values().stream().mapToInt(Buyer::getFood).sum();
        System.out.println(totalFood);
    }
}

