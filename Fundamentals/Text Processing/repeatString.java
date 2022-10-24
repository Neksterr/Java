package textProcessing;

import java.util.*;

public class repeatStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> result = new ArrayList<>();
        String[] input = scan.nextLine().split(" ");
        for (String s : input) {
            result.add(repeat(s, s.length()));
        }
        System.out.println(result.toString().replaceAll("[\\[\\], ]", ""));
    }

    public static String repeat(String input,int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += input;
        }

        return result;
    }
}
