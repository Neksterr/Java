package regularExpressions;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class matchPhoneNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String numbers = scan.nextLine();
        Pattern patt = Pattern.compile("\\+359([ -])2\\1\\d{3}\\1\\d{4}\\b");
        Matcher match =patt.matcher(numbers);
        List<String> matchedPhones = new LinkedList<>();

        while(match.find()){
            matchedPhones.add(match.group());
        }
        System.out.println(String.join(", ", matchedPhones));

    }
}
