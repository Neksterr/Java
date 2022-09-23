package List;

import java.util.*;
import java.util.stream.Collectors;

import javax.lang.model.element.Element;

public class changeList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scan.nextLine();
        while (!input.equals("end")) {
            String commandName = input.split(" ")[0];
            int element =Integer.parseInt(input.split(" ")[1]);
            if(commandName.equals("Delete")){
                numbers.removeAll(Arrays.asList(element));
            } else if(commandName.equals("Insert")){
                int position =Integer.parseInt(input.split(" ")[2]);
                numbers.add(position, element);
            }
            input = scan.nextLine();
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
