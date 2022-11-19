package stackAndQueues;

import java.util.*;

public class matchingBrackets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String equasion = scan.nextLine();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
       for (int i = 0; i< equasion.length() ; i++) {
        char symbol = equasion.charAt(i);
        if(symbol == '('){
            stack.push(i);
        } else if(symbol == ')') {
            int start = stack.pop();
            String output = equasion.substring(start, i + 1);
            System.out.println(output);
        }
       }

    }

}
