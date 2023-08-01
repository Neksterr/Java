package OOP.WorkingWithAbstraction.JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] demensions = readPositions(scan.nextLine());
        int x = demensions[0];
        int y = demensions[1];

        int[][] galaxy = new int[x][y];

        fillGalaxy(x, y, galaxy);

        String command = scan.nextLine();
        long sumStars = 0;
        while (!command.equals("Let the Force be with you")) {
            int[] jediPosition = readPositions(command);
            int[] evilPosition = readPositions(scan.nextLine());
            int currrowEvil = evilPosition[0];
            int currColEvil = evilPosition[1];

            while (currrowEvil >= 0 && currColEvil >= 0) {
                if (isInBounds(galaxy,currrowEvil,currColEvil)) {
                    galaxy[currrowEvil][currColEvil] = 0;
                }
                currrowEvil--;
                currColEvil--;
            }

            int currRowJedi = jediPosition[0];
            int currColJedi = jediPosition[1];

            while (currRowJedi >= 0 && currColJedi < galaxy[1].length) {
                if ( isInBounds(galaxy,currRowJedi,currColJedi)) {
                    sumStars += galaxy[currRowJedi][currColJedi];
                }

                currColJedi++;
                currRowJedi--;
            }

            command = scan.nextLine();
        }

        System.out.println(sumStars);


    }
    private static boolean isInBounds(int[][] galaxy, int row, int col){
        return row >= 0 && col >= 0 && row < galaxy.length && col < galaxy[row].length;
    }
    private static int[] readPositions(String command) {
        return Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    private static void fillGalaxy(int x, int y, int[][] galaxy) {
        int value = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                galaxy[i][j] = value++;
            }
        }
    }
}
