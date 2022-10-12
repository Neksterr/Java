package AssociativeArrays;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class oddOccurrences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> words = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());
        List<String> odd = new ArrayList<>();
        Map<String, Integer> wordsMap = new LinkedHashMap<>();
        for (String word : words) {
            String wordsLowerCase = word.toLowerCase();
            if (wordsMap.containsKey(wordsLowerCase)) {

                wordsMap.put(wordsLowerCase, wordsMap.get(wordsLowerCase) + 1);
            } else {

                wordsMap.put(wordsLowerCase, 1);
            }
        }

        for (var entry : wordsMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                odd.add(entry.getKey());
            }

        }

        for (int i = 0; i < odd.size(); i++) {

            System.out.print(odd.get(i));
            if (i < odd.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
