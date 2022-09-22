package List;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class mergingLists {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> firstList = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> result = new ArrayList<>();
        int size = 0;
        if(firstList.size() >= secondList.size()){
            size = secondList.size();
        } else {
            size = firstList.size();
        }

        for(int i = 0; i < size; i ++){
            int firstEl = firstList.get(i);
            int secondEl = secondList.get(i);

            result.add(firstEl);
            result.add(secondEl);
            
        }
        if(firstList.size() > secondList.size()){
            result.addAll(firstList.subList(size,firstList.size()) );
        } else {
            result.addAll(secondList.subList(size, secondList.size()));
        }
        System.out.println(result.toString().replaceAll("[\\[\\],]", ""));
    }
}
