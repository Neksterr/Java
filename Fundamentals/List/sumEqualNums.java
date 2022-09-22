package List;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class sumEqualNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> numbers = Arrays.stream(scan.nextLine().split(" ")).map(Double::parseDouble)
                .collect(Collectors.toList());

        for (int i = 0; i <  numbers.size() - 1; i++) {
            if (numbers.get(i).equals(numbers.get(i + 1))) {
                numbers.set(i, (numbers.get(i) + numbers.get(i + 1)));
                numbers.remove(i + 1);
                i = -1;
            }
        }
        for (var item : numbers) {
            if (item % 1 == 0) {
                System.out.printf("%.0f", item);
                System.out.print(" ");
            } else {
                System.out.print(item + " ");

            }

        }

    }
}
