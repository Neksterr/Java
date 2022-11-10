package finalPrep;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class destinationMapper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            String text = scan.nextLine();

            Pattern patt = Pattern.compile("([=\\/])(?<word>[A-Z][A-Za-z]{2,})\\1");
            Matcher match = patt.matcher(text);
            int sum = 0;
            List<String> destinations = new LinkedList<>();
            while(match.find()){

                int travelPoints = match.group("word").length();

                sum += travelPoints;

                destinations.add(match.group("word"));

            }

            System.out.println("Destinations:" + destinations.toString().replaceAll("[\\[\\]]", " " ));
            System.out.println("Travel Points: " + sum);

    }
}
