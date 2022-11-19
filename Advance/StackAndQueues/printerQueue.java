package stackAndQueues;

import java.util.*;

public class printerQueue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fileName = scan.nextLine();
        ArrayDeque<String> queue = new ArrayDeque<>();
        while (!fileName.equals("print")) {
            if (fileName.equals("cancel")) {
                if(queue.isEmpty()){
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + queue.poll());
                }
                
            } else {
                queue.offer(fileName);
            }
            fileName = scan.nextLine();
        }
        queue.stream().forEach(name -> System.out.println(name));
    }
}
