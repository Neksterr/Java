import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
public class addVAT {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Function<String, Double> addVAT = (p) -> Double.parseDouble(p) * 1.2;
        String input = scan.nextLine();
        System.out.println("Prices with VAT:");
        Arrays.stream(input.split(", "))
                .map(addVAT)
                .forEach(e -> System.out.printf("%.2f%n", e));
    }
}
