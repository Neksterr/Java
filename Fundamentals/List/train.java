package List;

import java.util.*;
import java.util.stream.Collectors;

public class train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> wagons = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        while (!input.equals("end")) {
            String[] data = input.split("\\s+");
            if (data[0].equals("Add")) {
                wagons.add(Integer.parseInt(data[1]));
            } else {
                int passengers = Integer.parseInt(data[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    if(wagons.get(i) + passengers <= maxCapacity){
                        wagons.set(i,    wagons.get(i) + passengers);
                        break;
                    }
                }
            }
            input = scan.nextLine();
        }
        
        for (Integer item : wagons) {
            System.out.print(item + " ");
        }
    }
}
