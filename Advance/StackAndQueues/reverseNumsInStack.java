package stackAndQueues;
import java.util.*;
public class reverseNumsStack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (Integer integer : nums) {
            stack.push(integer);
        }
        System.out.println(stack.toString().replaceAll("[\\[\\],]", ""));
    }
}
