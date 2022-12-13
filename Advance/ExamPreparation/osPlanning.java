package examPreparation;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class osPlanning {
    private static Scanner scan = new Scanner(System.in);

    

     
    public static void main(String[] args) {

        ArrayDeque<Integer> taskStack = readStack(", ");
        ArrayDeque<Integer> threadQueue = readQueue(" ");
        int n = Integer.parseInt(scan.nextLine());
        int task = taskStack.peek();
        int thread = threadQueue.peek();

        while (task != n) {
            if (task <= thread) {
                taskStack.pop();
            }
            threadQueue.poll();

            task = taskStack.peek();
            thread = threadQueue.peek();
        }
        System.out.println("Thread with value " + threadQueue.peek() +  " killed task " + n);
        String left = threadQueue.stream().map(String::valueOf).collect(Collectors.joining(" "));
        System.out.println(left);

    }

    private static ArrayDeque<Integer> readQueue(String delimiter) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        getNums(queue, queue::offer, delimiter);
        return queue;
    }

    private static ArrayDeque<Integer> readStack(String delimiter) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        getNums(stack, stack::push, delimiter);
        return stack;
    }

    private static void getNums(ArrayDeque<Integer> deque, Consumer<Integer> operation, String separator) {
        Arrays.stream(scan.nextLine().split(separator))
                .map(Integer::parseInt)
                .forEach(operation);
    }
}
