package methods;
import java.util.*;
public class mathOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num1 = Double.parseDouble(scan.nextLine());
        String sign = scan.nextLine();
        double num2 = Double.parseDouble(scan.nextLine());
        System.out.printf("%.0f",operation(num1, sign, num2));
        

    }
    public static double operation(double num1, String sign, double num2){
        double result = 0.0;
        switch(sign){
            case "/":
            result = num1 / num2;
            break;
            case "-":
            result = num1 - num2;
            break;
            case "+":
            result = num1 + num2;
            break;
            case "*":
            result = num1 * num2;
            break;
        }
        return result;
    }
}
