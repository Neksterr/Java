package textProcessing;

import java.util.*;

public class caesarCipher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        StringBuilder sb = new StringBuilder(input.length());
        for (int i = 0; i < input.length(); i++) {
            sb.append((char) (input.charAt(i) + 3));
        }
        System.out.println(sb);
    }
}
