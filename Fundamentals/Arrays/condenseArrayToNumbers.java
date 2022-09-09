import java.util.*;

public class arrToNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        while (nums.length > 1) {
            int[] newArr = new int[nums.length - 1];
            for (int i = 0; i < newArr.length; i++) {
                newArr[i] = nums[i] + nums[i + 1];

            }
            nums = newArr;
        }
        System.out.println(nums[0]);
    }

}
