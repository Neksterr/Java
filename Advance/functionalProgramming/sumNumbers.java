package functional;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
public class sumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scan.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList());
        Function<List<Integer>,Integer> sum = n -> n.stream().mapToInt(e -> e).sum();
        System.out.println( "Count = " + numbers.size());
        System.out.println("Sum = " + sum.apply(numbers));
    }
}
