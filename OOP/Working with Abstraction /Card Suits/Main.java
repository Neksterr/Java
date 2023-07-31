package OOP.WorkingWithAbstraction.CardSuit;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println("Card Suits: ");
        Arrays.stream(Cards.values()).forEach(Cards -> System.out.printf("Ordinal value: %d; Name value: %s%n", Cards.ordinal(), Cards.name()));
    }
}
