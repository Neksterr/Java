package AssociativeArrays;

import java.util.*;

public class countCharsInString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        Map<Character, Integer> charMap = new LinkedHashMap<>();
        for (char letter : word.toCharArray()) {
            if(letter == ' ') {continue;}
            if (!charMap.containsKey(letter)) {

                charMap.put(letter, 1);
            } else {
                int currentCount = charMap.get(letter);
                charMap.put(letter, currentCount + 1);
            }
        }

        // for(Map.Entry<Character,Integer> entry: charMap.entrySet()){
        //     System.out.printf("%s -> %s%n", entry.getKey(),entry.getValue());
        // }
            charMap.entrySet().forEach(entry -> System.out.printf("%s -> %s%n", entry.getKey(),entry.getValue()));
    }
}
