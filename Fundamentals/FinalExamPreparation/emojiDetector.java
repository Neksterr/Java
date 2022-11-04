package finalPrep;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class emojiDetector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        

        long cool = 1;
        int countValid = 0;
        int sum = 0;

        for (int i = 0; i < text.length(); i++) {
            if(Character.isDigit(text.charAt(i))){
                cool *= text.charAt(i) - '0';

            }
            
        }


        System.out.println("Cool threshold: " + cool);

        Map<String, Long> emojiList = new LinkedHashMap<>();
        Pattern emojiPatern = Pattern.compile("([:*]{2})(?<emoji>[A-z][a-z]{2,})\\1");
        Matcher emojiMatcher = emojiPatern.matcher(text);

        while(emojiMatcher.find()){

            countValid++;
            long currentCoolness = 0;
            for(int i = 0; i < emojiMatcher.group("emoji").length();i++){
                currentCoolness += emojiMatcher.group("emoji").charAt(i);
            }
            if(currentCoolness >= cool){
                emojiList.put(emojiMatcher.group(), currentCoolness);
            }
        }
        System.out.printf("%d emojis found in the text. The cool ones are:%n", countValid);
        emojiList.forEach((k,v) -> System.out.println(k));
    }
}
