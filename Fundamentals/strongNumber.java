import java.util.Scanner;
public class StrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int input = n;
        int factorialSum = 0;
        while(n > 0) {
            int num = n % 10;
            int fac = 1;
            for(int i = 1; i <= num; i++) {
                fac *= i;
            }
            factorialSum += fac;
            n /= 10;
        }
        if(factorialSum == input) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
