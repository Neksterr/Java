package textProcessing;

import java.util.*;

public class substring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String removeWord = scan.nextLine();
        String input = scan.nextLine();

        int index = input.indexOf(removeWord);
        while (index != -1) {
            input = input.replace(removeWord, "");
            index = input.indexOf(removeWord);
        }
        System.out.println(input);
    }
}
