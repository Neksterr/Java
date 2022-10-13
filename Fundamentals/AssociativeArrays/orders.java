package AssociativeArrays;

import java.net.ProxySelector;
import java.util.*;

public class orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        Map<String, Double> productMap = new LinkedHashMap<>();
        Map<String, Double> productQuantity = new LinkedHashMap<>();
        while (!input.equals("buy")) {
            String[] data = input.split(" ");
            String product = data[0];
            Double price = Double.parseDouble(data[1]);
            Double quantity = Double.parseDouble(data[2]);
            productMap.put(product, price);
            if (!productQuantity.containsKey(product)) {
                productQuantity.put(product, quantity);
            } else {

                productQuantity.put(product, productQuantity.get(product) + quantity);
            }

            input = scan.nextLine();
        }
        for (Map.Entry<String, Double> entry : productMap.entrySet()) {

            String productName = entry.getKey();
            double finalSum = entry.getValue() * productQuantity.get(productName);
            System.out.printf("%s -> %.2f%n", productName, finalSum);
        }
    }
}
