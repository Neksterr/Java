package OOP.Encapsulation.ClassBox;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double length = Double.parseDouble(scan.nextLine());
        double width = Double.parseDouble(scan.nextLine());
        double height = Double.parseDouble(scan.nextLine());
        Box box = new Box(length,width,height);
        System.out.printf("Surface Area - %.2f%nLateral Surface Area - %.2f%nVolume - %.2f",box.calculateSurfaceArea(),box.calculateLateralSufaceArea(),box.calculateVolume());

    }
}
