package examPreparation;

import java.util.*;
import java.util.function.Consumer;

public class energyDrinks {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayDeque<Integer> milligramsStack = readStack(", ");
        ArrayDeque<Integer> drinksQueue = readQueue(", ");
        int stamatCaffeine = 0;

        while (!milligramsStack.isEmpty() && !drinksQueue.isEmpty()) {
            int currMilligrams = milligramsStack.peek();
            int currDrinks = drinksQueue.peek();
            int caffeine =  currMilligrams * currDrinks;
            if ((caffeine + stamatCaffeine) <= 300) {
                stamatCaffeine += caffeine;
                milligramsStack.pop();
                drinksQueue.poll();
            } else {
                milligramsStack.pop();
                drinksQueue.offer(drinksQueue.peek());
                drinksQueue.poll();
                if (stamatCaffeine >= 30) {
                    stamatCaffeine -= 30;
                }
            }
        }
        if(!drinksQueue.isEmpty()){
            System.out.printf("Drinks left: %s%n", String.join(", ", Arrays.asList(drinksQueue.toString().substring(1,drinksQueue.toString().length() -1 ))));
        } else {
            System.out.println("At least Stamat wasn't exceeding the maximum caffeine.");
        }
        System.out.println("Stamat is going to sleep with " + stamatCaffeine + " mg caffeine.");
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
