package javaAdvanced.stackQueues;
import java.util.ArrayDeque;
import java.util.Scanner;
public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] NSX = scanner.nextLine().split("\\s+");
        String[] nums = scanner.nextLine().split("\\s+");
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        
        int n = Integer.parseInt(NSX[0]);
        int s = Integer.parseInt(NSX[1]);
        int x = Integer.parseInt(NSX[2]);
        for(int i = 0; i < n; i++){
            stack.push(Integer.parseInt(nums[i]));
        }
        for(int i = 0; i < s; i++){
            stack.pop();
        }
        if(stack.contains(x)){
            System.out.println("true");
        }
        else if(stack.isEmpty()){
            System.out.println("0");
        }
        else{
            int min = Integer.MAX_VALUE;
            for(int el : stack){
                if(el < min){
                    min = el;
                }
            }
            System.out.println(min);
        }
    }
}
