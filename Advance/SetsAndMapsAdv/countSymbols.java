package setsAndMapsAdv;
import java.util.*;
public class countSymbols {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Map<Character, Integer> lettersSet = new TreeMap<>();
        for (int i = 0 ; i < input.length(); i++) {
            char currChar = input.charAt(i);
            lettersSet.putIfAbsent(currChar, 0);
            lettersSet.put(currChar, lettersSet.get(currChar) + 1);

        }
        lettersSet.forEach((k,v) -> System.out.printf("%s: %d time/s%n",k ,v));
    }
}
