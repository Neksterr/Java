package regularExpressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import methods.mathOperations;

public class furniture {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        double sum = 0;
        List<String> names = new LinkedList<>();
        String regex = "^[>]{2}(?<name>[\\w]+)[<]{2}(?<price>[\\d]+[.]?[\\d]+)[!](?<quantity>[\\d]+)";
        Pattern patt = Pattern.compile(regex);
        while (!input.equals("Purchase")) {

            Matcher match = patt.matcher(input);

            if (match.find()) {

                String nameFur = match.group("name");

                Double price = Double.parseDouble(match.group("price"));
                int quantity = Integer.parseInt(match.group("quantity"));
                names.add(nameFur);
                sum += price * quantity;

            }
            input = scan.nextLine();
        }
        System.out.println("Bought furniture:");
        names.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", sum);
    }
}
