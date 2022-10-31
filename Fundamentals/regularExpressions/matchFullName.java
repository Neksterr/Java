package regularExpressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class natchFullName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = "\\b[A-Z][a-z]+ [A-Z][a-z]+\\b";
        String name = scan.nextLine();
        Pattern patt = Pattern.compile(regex);
        Matcher mach = patt.matcher(name);
        while(mach.find()){
            System.out.print(mach.group() + " ");
        }

    }
}
