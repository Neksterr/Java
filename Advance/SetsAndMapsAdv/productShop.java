package setsAndMapsAdv;
import java.util.*;
public class productShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Map<String, Double>> productMap = new TreeMap<>();
        String input = scan.nextLine();

        while(!input.equals("Revision")){
            String[] data = input.split(", ");
            String shop = data[0];
            String product = data[1];
            double price = Double.parseDouble(data[2]);

            productMap.putIfAbsent(shop, new LinkedHashMap<>());
            productMap.get(shop).put(product, price);

            input = scan.nextLine();
        }
        productMap.forEach((store, productPrice) -> {
            System.out.println(store + "->");
            productPrice.forEach((p,c) -> System.out.printf("Product: %s, Price: %.1f%n", p, c));
        });
    }
}
