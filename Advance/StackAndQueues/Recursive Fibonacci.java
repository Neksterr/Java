package stackAndQueues;
import java.util.*;
public class recursiveFibb {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        ArrayDeque<Long> stack = new ArrayDeque<>();
        if (num < 2) {
            System.out.println(1);
            return;
        }
        stack.push(0l);
        stack.push(1l);
        for (int i = 0; i < num; i++) {
            long num1 = stack.pop();
            long num2 = stack.pop();
            stack.push(num1);
            stack.push(num1 + num2);
        }
        System.out.println(stack.pop());
    }
}
