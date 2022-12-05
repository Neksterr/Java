package multidimensionalArrays;
import java.util.*;
public class crossfire {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] data = scan.nextLine().split(" ");
        int rows = Integer.parseInt(data[0]);
        int cols = Integer.parseInt(data[1]);int n = 1;
        List<List<Integer>> matrix = readMatrix(rows, cols);
        String input = scan.nextLine();
        while(!input.equals("Nuke it from orbit")){
            String[] numbs = input.split(" ");
            int row1 = Integer.parseInt(numbs[0]);
            int col1 = Integer.parseInt(numbs[1]);
            int radius = Integer.parseInt(numbs[2]);
            
            for(int i = row1 - radius; i < row1 + radius; i ++){
                if (isInBoundary(i, col1, matrix) && i != row1){
                    matrix.get(i).remove(col1);
                }
            }
            for (int i = col1 + radius; i >= col1 - radius; i--) {
                if (isInBoundary(row1, i, matrix)){
                    matrix.get(row1).remove(i);
                }
            }
            matrix.removeIf(List::isEmpty);
            input = scan.nextLine();
        }
        printMatrix(matrix);
    }
    public static List<List<Integer>> readMatrix(int rows,int cols) {

        int n = 1;
        List<List<Integer>> matrix = new ArrayList<>();
        
        for (int row = 0; row < rows; row++) {
            List<Integer> rowList = new ArrayList<>();
            for (int col = 0; col < cols; col++) {
                rowList.add(Integer.valueOf(n++));
            }
            matrix.add(rowList);
        }

        return matrix;
    }
    private static boolean isInBoundary(int row, int col, List<List<Integer>> matrix) {
        return row >= 0 && col >= 0
                && row < matrix.size() && col < matrix.get(row).size();
    }
    private static void printMatrix(List<List<Integer>> matrix) {
        matrix.forEach(row -> {
            StringBuilder sb = new StringBuilder();
            row.forEach(cell -> sb.append(String.format("%s ", cell)));
            System.out.println(sb);
        });
    }
}
