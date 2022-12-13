package functional;
import java.util.*;
import java.util.stream.Collectors;
public class sortEvenNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       List<Integer> numbers = Arrays.stream(scan.nextLine().split(", ")).map(Integer::parseInt).filter(num -> num % 2 == 0).collect(Collectors.toList());
       System.out.println(numbers.toString().replaceAll("[\\[\\]]", ""));
        numbers.sort(Integer::compareTo);
        
        System.out.println(numbers.toString().replaceAll("[\\[\\]]", ""));
    }
}
