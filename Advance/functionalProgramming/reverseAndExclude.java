package functional;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class reverseAndExclude {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scan.nextLine().split( " ")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
        int devision = Integer.parseInt(scan.nextLine());
        Predicate<Integer> predicate = number -> number % devision == 0;
        nums.removeIf(predicate);
        Collections.reverse(nums);
        nums.forEach(e -> System.out.printf("%d ",e));
    }
    
}
