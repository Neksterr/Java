package functional;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class findEvenOrOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] range = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
                String condition = scan.nextLine();
                System.out.println(IntStream.range(range[0], range[1] + 1).boxed().filter(getPredicate(condition)).map(String::valueOf).collect(Collectors.joining(" ")));

    }
    public static Predicate<Integer> getPredicate(String condition) {
        if (condition.equals("odd")) {
            return n -> n % 2 != 0;
        }
        return n -> n % 2 == 0;
    }
}
