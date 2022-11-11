package finalPrep;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import methods.calculations;

public class adAstra {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        Pattern patt = Pattern.compile(
                "([#|])(?<name>[A-Za-z\\s]+)\\1(?<date>[\\d]{2}[\\/][\\d]{2}[\\/][\\d]{2})\\1(?<calories>[\\d]{1,5})\\1");
        Matcher match = patt.matcher(text);

        List<String> food = new LinkedList<>();
        List<String> date = new LinkedList<>();
        List<Integer> calories = new LinkedList<>();
        while (match.find()) {

            food.add(match.group("name"));
            date.add(match.group("date"));
            calories.add(Integer.parseInt(match.group("calories")));

        }

        int sum = calories.stream().mapToInt(d -> d).sum();

        int days = sum / 2000;

        System.out.printf("You have food to last you for: %d days!%n", days);
        for (int i = 0; i < food.size(); i++) {
            System.out.printf("Item: %s, Best before: %s, Nutrition: %d%n", food.get(i), date.get(i), calories.get(i));
        }

    }
}
