import java.util.*;
public class evenOddSubstraction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int evenSum = 0, oddSum = 0, sub = 0;
        int[] nums = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                evenSum += nums[i];
            }
            else{
                oddSum += nums[i];
            }
        }
        sub = evenSum - oddSum;
        System.out.println(sub);
    }
    
}
