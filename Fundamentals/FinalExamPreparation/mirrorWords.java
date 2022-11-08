package finalPrep;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import methods.mathOperations;

public class mirrorWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> pairs = new LinkedList<>();
        String text = scan.nextLine();
        String regex = "([@#])(?<word>[A-za-z]{3,})\\1\\1(?<word2>[A-za-z]{3,})\\1";

        Pattern patt = Pattern.compile(regex);
        Matcher matcher = patt.matcher(text);

        while (matcher.find()) {
            pairs.add(String.format("%s <=> %s", matcher.group("word"), matcher.group("word2")));
        }

        if (pairs.isEmpty()) {
            System.out.println("No mirror words!");
        } else {
            System.out.printf("%d word pairs found!\n", pairs.size());
        }
        List<String> mirrored = new LinkedList<>();
        pairs.forEach(pair -> {
            String[] words = pair.split(" <=> ");

            StringBuilder sb = new StringBuilder(words[1].length());
            sb.append(words[1]).reverse();
            if (words[0].equals(sb.toString())) {
                mirrored.add(pair);
            }
        });
        if (mirrored.size() == 0) {
            System.out.println("No mirror words!");
        } else {
            System.out.printf("The mirror words are: %n%s", String.join(", ", mirrored));
        }

    }
}
