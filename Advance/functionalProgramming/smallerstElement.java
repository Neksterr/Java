package functional;
import java.util.*;
import java.util.function.Function;
public class smallerstElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Function<int[], Integer> min = arr -> {
            int minimal = Integer.MAX_VALUE;
            int minIx = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] <= minimal) {
                    minimal = arr[i];
                    minIx = i;
                }
            }
            return minIx;
        };
        int[] nums = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(min.apply(nums));
    }
}
