package List;

import java.util.*;
import java.util.stream.Collectors;

import javax.swing.plaf.metal.MetalBorders.PaletteBorder;

public class cardGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> playerOne = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> playerTwo = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        int size = playerOne.size();
        while (playerOne.size() > 0 && playerTwo.size() > 0) {
            if (playerOne.get(0).equals(playerTwo.get(0))) {
                playerOne.remove(0);
                playerTwo.remove(0);
            }

            else if (playerOne.get(0) > playerTwo.get(0)) {
                playerOne.add(playerOne.get(0));
                playerOne.add(playerTwo.get(0));
                playerOne.remove(playerOne.get(0));
                playerTwo.remove(playerTwo.get(0));
            } else if(playerOne.get(0) < playerTwo.get(0))  {

                playerTwo.add(playerTwo.get(0));
                playerTwo.add(playerOne.get(0));
                playerTwo.remove(playerTwo.get(0));
                playerOne.remove(playerOne.get(0));

            }

        }
        int sum = 0;
        if (playerOne.size() > playerTwo.size()) {

            for (int i = 0; i < playerOne.size(); i++) {
                sum += playerOne.get(i);
            }

            System.out.printf("First player wins! Sum: %d", sum);
        } else {

            for (int i = 0; i < playerTwo.size(); i++) {
                sum += playerTwo.get(i);
            }

            System.out.printf("Second player wins! Sum: %d", sum);
        }

    }
}
