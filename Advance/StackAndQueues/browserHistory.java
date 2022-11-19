package stackAndQueues;

import java.util.*;

public class browserHist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<String> urls = new ArrayDeque<>();
        String text = scan.nextLine();
        String currUrl = "";
        while (!text.equals("Home")) {

            if (text.equals("back")) {
                if (urls.isEmpty()) {
                    System.out.println("no previous URLs");
                    text = scan.nextLine();
                    continue;
                } else {
                    String prev = urls.pop();
                    currUrl = prev;
                }

            } else {
                if (!currUrl.equals("")) {
                    urls.push(currUrl);
                }

                currUrl = text;

            }
            System.out.println(currUrl);
            text = scan.nextLine();
        }

    }
}
