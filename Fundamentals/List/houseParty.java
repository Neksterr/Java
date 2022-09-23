package List;

import java.util.*;

import javax.imageio.ImageIO;

public class houseParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numCommands = Integer.parseInt(scan.nextLine());
        List<String> guests = new ArrayList<>();
        for (int i = 0; i < numCommands; i++) {
            String input = scan.nextLine();
            String[] data = input.split(" ");
            String name = data[0];
            if (!input.contains("not")) {
                if (guests.contains(name)) {
                    System.out.printf("%s is already in the list!\n", name);
                } else {
                    guests.add(name);
                }
            } else {
                if (guests.contains(name)) {
                    guests.remove(name);
                } else {
                    System.out.printf("%s is not in the list!\n", name);
                }
            }
        }
        for(int i = 0; i < guests.size();i++){
        System.out.printf("%s\n",guests.get(i));
        }
    }
}
