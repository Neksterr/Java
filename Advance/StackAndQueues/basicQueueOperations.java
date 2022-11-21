package stackAndQueues;
import java.util.*;
public class vasicQueueOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] n = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int pushElements = n[0];
        int popElements = n[1];
        int checkEl = n[2];

        int[] nums = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        for(int i = 0; i < pushElements; i++){
            stack.offer(nums[i]);
        }

        for(int i = 0 ; i < popElements; i++){
            stack.poll();
        }
        if(stack.isEmpty()) {
            System.out.println(0);
        }
        else if(stack.contains(checkEl)){
            System.out.println("true");
        } else { 
           System.out.println(Collections.min(stack));
        }
        

    }
}
