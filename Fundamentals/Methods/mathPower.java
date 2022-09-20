package methods;
import java.util.*;
public class mathPower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num = Double.parseDouble(scan.nextLine());
        int powNum = Integer.parseInt(scan.nextLine());
        System.out.println(mathPow(num, powNum));
    }
    public static double mathPow(double num, int pow){
        return Math.pow(num,pow);
    }
}
