package ObjectsAndClasses;
import java.util.*;
public class randomizeWords {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] words = input.split("\\s+");
        Random generator = new Random();
        for(int i = 0; i < words.length; i++){
            int x = generator.nextInt(words.length);
            int y = generator.nextInt(words.length);
            String oldWord = words[x];
            words[x] = words[y];
            words[y] = oldWord;

        }
        System.out.println(String.join(System.lineSeparator(), words));
    }
}
