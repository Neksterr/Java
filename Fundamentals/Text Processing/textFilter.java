package textProcessing;

import java.util.*;



public class textFilter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] bannedWords = scan.nextLine().split(", ");
        String text = scan.nextLine();
        for (String word : bannedWords) {
            
                String replaced = stars("*", word.length());
                text = text.replaceAll(word,replaced);
            
        }
        System.out.println(text);
    }

    public static String stars(String words, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += words;
        }

        return result;
    }
}
