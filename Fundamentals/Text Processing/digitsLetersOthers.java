package textProcessing;

import java.util.*;

public class digitsLettersOthers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder others = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (Character.isDigit(symbol)) {
                digits.append(symbol);
            } else if (Character.isLetter(symbol)) {
                letters.append(symbol);
            } else {
                others.append(symbol);
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(others);

    }
}
