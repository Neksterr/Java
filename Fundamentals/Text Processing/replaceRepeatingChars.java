package textProcessing;
import java.util.*;
public class replaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        StringBuilder sb = new StringBuilder();

        char check = '\0';
        for(int i = 0; i < input.length(); i++){
            if(!(check == input.charAt(i))){
                sb.append(input.charAt(i));
                check = input.charAt(i);
            }
        }
        System.out.println(sb);
    }
}
