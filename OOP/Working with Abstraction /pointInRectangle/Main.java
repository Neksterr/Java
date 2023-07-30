package OOP.WorkingWithAbstraction.PointInRectangle;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] coordinates = Arrays.stream(scan.nextLine().split( " ")).mapToInt(Integer::parseInt).toArray();

        Point bottomLeft = new Point(coordinates[0], coordinates[1]);
        Point topRight = new Point(coordinates[2], coordinates[3]);
        Rectangle rect = new Rectangle(bottomLeft,topRight);
        int n = Integer.parseInt(scan.nextLine());
        while (n-- > 0){
            int[] pointCoordinates = Arrays.stream(scan.nextLine().split( " ")).mapToInt(Integer::parseInt).toArray();
            Point x = new Point(pointCoordinates[0], pointCoordinates[1]);
            boolean isInside = rect.contains(x);
            System.out.println(isInside);
        }
    }
}
