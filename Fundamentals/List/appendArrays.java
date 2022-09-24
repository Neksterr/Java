package List;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class appendArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in);
        List<String> nums = Arrays.stream(scan.nextLine().split("\\|")).collect(Collectors.toList());
        Collections.reverse(nums); 
        System.out.println(nums.toString().replaceAll("[\\[\\],]", "").replaceAll("\\s+"," ").trim());

        
    }
}
