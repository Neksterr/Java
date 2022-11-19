package stackAndQueues;

import java.util.*;

public class hotPotato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] kids = scan.nextLine().split(" ");
        int n = Integer.parseInt(scan.nextLine());
        ArrayDeque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue, kids);
        while (queue.size() > 1) {
            for (int i = 1; i < n; i++) {
                queue.offer(queue.poll());
            }
            System.out.println("Removed " + queue.poll());
        }
        System.out.println("Last is " + queue.poll());
    }
}
