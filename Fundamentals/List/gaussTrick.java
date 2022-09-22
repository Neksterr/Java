package List;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class gaussTrick {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int size = numbers.size() ;
        for(int i = 0; i < size / 2 ; i++){
            int first = numbers.get(i);
            int second = numbers.get(numbers.size() - 1);
            numbers.set(i, first + second);
            numbers.remove(numbers.size() - 1);



        }
        for (var item: numbers) {
            System.out.print(item + " ");
        }

    }
}
