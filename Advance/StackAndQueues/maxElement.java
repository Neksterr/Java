package stackAndQueues;
import java.util.*;
public class maximumEl {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int n = Integer.parseInt(scan.nextLine());
       
        for(int i = 0; i < n ;i++){
             int[] commands = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
            int command = commands[0];

            switch(command){
                case 1:
                stack.push(commands[1]);
                break;
                case 2:
                stack.pop();
                break;
                case 3: 
                System.out.println(Collections.max(stack));
                break;
            }
        }
    }
}
