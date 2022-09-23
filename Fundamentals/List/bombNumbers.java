package List;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.imageio.ImageIO;
public class bombNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String[] input = scan.nextLine().split(" ");
        int special = Integer.parseInt(input[0]);
        int power = Integer.parseInt(input[1]);
        int sum = 0;
        while(numbers.contains(special)){
            int indexBomb = numbers.indexOf(special);
            int front = Math.max(indexBomb - power, 0);
            int back = Math.min(indexBomb + power, numbers.size() - 1);

            for(int i = front; i <= back; i++){
                numbers.remove(front);
            }
        }
        for(Integer num : numbers){
            sum += num;
        }
        System.out.println(sum);

        
    }
}
