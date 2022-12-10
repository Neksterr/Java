package setsAndMapsAdv;

import java.util.*;

import stackAndQueues.recursiveFibb;

public class handsOfCArds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Map<String, HashSet<String>> cardsMap = new LinkedHashMap<>();
        while (!input.equals("JOKER")) {
            String[] data = input.split(": ");
            String name = data[0];
            String[] cards = data[1].split(", ");
            cardsMap.putIfAbsent(name, new HashSet<>());
            for (String card : cards) {
                cardsMap.get(name).add(card);
            }
            input = scan.nextLine();
        }
        cardsMap.forEach((k,v) -> {
            int points = calculatePoints(v);
            System.out.println(k + ": " + points);
        });
    }

    public static int calculatePoints(Set<String> cards) {
        int points = 0;
        for (String card : cards) {
            String power = card.substring(0, card.length() - 1);
            char type = card.charAt(card.length() - 1);
            int cardPoints = getPower(power) * getType(type);
            points += cardPoints;
            
        }
        return points;
    }

    public static int getPower(String power) {
        switch (power) {
            case "J":
                return 11;
            case "Q":
                return 12;
            case "K":
                return 13;
            case "A":
                return 14;
            default:
                return Integer.parseInt(power);
        }
    }

    public static int getType(char type) {
        switch (type) {
            case 'S':
                return 4;
            case 'H':
                return 3;
            case 'D':
                return 2;
            case 'C':
                return 1;
            default:
                return 0;
        }
    }
}
