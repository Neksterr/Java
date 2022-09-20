package methods;
import java.util.*;
public class multiplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        if(num < 0){
            num *= (-1);
        }
        System.out.println(getMultipleOfEvensAndOdds(num));

    }
    public static int getOddSum(int num){
        int sumOdd = 0;
        while(num != 0){
            int digits = num % 10;
            if(digits % 2 == 1){
                sumOdd += digits;
            }
            num /= 10;
        }
        return sumOdd;

    }
    public static int getEvenSum(int num){
        int sum = 0;
        while(num != 0){
            int digits = num % 10;
            if(digits % 2 == 0){
                sum += digits;
            }
            num /= 10;
        }
        return sum;
    }
    public static int getMultipleOfEvensAndOdds(int num){
        return getEvenSum(num) * getOddSum(num);
    }
}
