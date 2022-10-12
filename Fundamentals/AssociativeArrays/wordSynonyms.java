package AssociativeArrays;

import java.util.*;

public class wordSysnonyms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, List<String>> wordMap = new LinkedHashMap<>();
        
        int lines = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < lines; i++){

            String word = scan.nextLine();
            String wordSynonym = scan.nextLine();
            

            if(!wordMap.containsKey(word)){
                wordMap.put(word, new ArrayList<>());
                wordMap.get(word).add(wordSynonym);
            } else {
                
                wordMap.get(word).add(wordSynonym);
            }


        }
        for (Map.Entry<String, List<String>> entry: wordMap.entrySet()) {

            System.out.printf("%s - %s%n",entry.getKey(),String.join(", ",entry.getValue() ));
        }
    }
}
