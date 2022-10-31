package regularExpressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class matchDates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String date = scan.nextLine();
        String regex = "\\b(?<day>\\d{2})([\\/.-])(?<month>\\w{3})\\2(?<year>\\d{4})\\b";
        Pattern patt = Pattern.compile(regex);
        Matcher match = patt.matcher(date);
        while (match.find()) {

            String day = match.group("day");
            String month = match.group("month");
            String year = match.group("year");
            System.out.printf("Day: %s, Month: %s, Year: %s%n",day,month,year);
        }

    }
}
