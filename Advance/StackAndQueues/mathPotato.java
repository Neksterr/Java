package stackAndQueues;

import java.util.*;

public class mathPotato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] names = scan.nextLine().split(" ");
        int n = Integer.parseInt(scan.nextLine());
        int count = 0;
        ArrayDeque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue, names);
        while (queue.size() > 1) {
            for (int i = 1; i < n; i++) {
                queue.offer(queue.poll());

            }
            count++;
            int compCount = 0;
            for (int i = 1; i <= count; i++) {
                if (count % i == 0) {
                    compCount++;
                }
            }
            if (compCount == 1 || compCount > 2) {
                System.out.println("Removed " + queue.poll());
            } else {
                System.out.println("Prime " + queue.peek());
            }
        }

        System.out.println("Last is " + queue.poll());
    }
}
