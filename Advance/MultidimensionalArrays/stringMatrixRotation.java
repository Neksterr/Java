package multidimensionalArrays;

import java.util.*;

public class stringMatrixRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String rotation = scan.nextLine();
        String input = scan.nextLine();
        List<String> wordList = new ArrayList<>();
        int maxLen = 0;
        while (!input.equals("END")) {
            int currLen = input.length();
            if (currLen > maxLen) {
                maxLen = currLen;
            }
            wordList.add(input);

            input = scan.nextLine();
        }
        int rows = wordList.size();
        int cols = maxLen;
        char[][] matrix = new char[rows][cols];
        for (int row = 0; row < wordList.size(); row++) {
            String currWord = wordList.get(row); 
            for (int col = 0; col < maxLen; col++) {
                if (col < currWord.length()) {
                    char curChar = currWord.charAt(col);
                    matrix[row][col] = curChar;
                } else {
                    matrix[row][col] = ' ';
                }
            }
        }
        String rotationDegree = rotation.split("[()]")[1];
        int angle = Integer.parseInt(rotationDegree);
        int angleRotation = angle % 360;
        printMatrix(matrix, rows, cols, angleRotation);

    }

    public static void printMatrix(char[][] matrix, int rows, int cols, int angleRotation) {
        switch (angleRotation) {
            case 0:
                for (int row = 0; row < rows; row++) {
                    for (int col = 0; col < cols; col++) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
            case 90:
                for (int col = 0; col < cols; col++) {
                    for (int row = rows - 1; row >= 0; row--) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
            case 180:
                for (int row = rows - 1; row >= 0; row--) {
                    for (int col = cols - 1; col >= 0; col--) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
            case 270:
                for (int col = cols - 1; col >= 0; col--) {
                    for (int row = 0; row < rows; row++) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }

                break;
            case 360:
                for (int row = 0; row < rows; row++) {
                    for (int col = 0; col < cols; col++) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
        }
    }
}
