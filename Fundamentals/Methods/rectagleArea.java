package methods;
import java.util.*;
public class rectagleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num1 = Double.parseDouble(scan.nextLine());
        double num2 = Double.parseDouble(scan.nextLine());
        
        System.out.printf("%.0f",printArea(num1, num2));

    }
    public static double printArea(double num1,double num2){
        return num1 * num2;
    }
}
