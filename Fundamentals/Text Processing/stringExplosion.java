package textProcessing;

import java.util.*;


public class stringExplosion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        StringBuilder sb = new StringBuilder(line);
        int strength = 0;
        for (int i = 0; i < sb.length(); i++) {
            char currentSymbol = sb.charAt(i);
            if (currentSymbol == '>') {
                strength += Integer.parseInt("" + sb.charAt(i + 1));

            } else if (currentSymbol != '>' && strength > 0) {
                sb.deleteCharAt(i);
                strength -- ;
                i--;
            }
        }
        System.out.println(sb);
    }
}
