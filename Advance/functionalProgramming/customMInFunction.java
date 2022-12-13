package functional;
import java.util.*;
import java.util.function.Function;
public class customMInFunction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Function<int[], Integer> minFunc = arr -> Arrays.stream(arr).sorted().findFirst().orElse(0);
        int[] nums = Arrays.stream(scan.nextLine().split( " ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(minFunc.apply(nums));
    }
}
