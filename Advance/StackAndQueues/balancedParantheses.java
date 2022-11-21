package stackAndQueues;
import java.util.*;
public class balancedParentheses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sequence = scan.nextLine();
        ArrayDeque<Character> stack = new ArrayDeque<>();
        boolean balanced = true;
        for(int i = 0 ; i < sequence.length(); i++){
            char symbol = sequence.charAt(i);
            if(symbol == '(' || symbol == '[' || symbol == '{' ){
                stack.push(symbol);
            } else {
                if (stack.isEmpty()) {
                    balanced = false;
                    break;
                }
                char lastOp = stack.pop();
                if(symbol == '}' && lastOp != '{'){
                    balanced = false;
                }else if(symbol == ')' && lastOp != '('){
                    balanced = false;

                }else if(symbol == ']' && lastOp != '['){
                    balanced = false;

                }

            }
        }
        if(balanced){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    
}
