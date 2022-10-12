package AssociativeArrays;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class countRealNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> listNum = Arrays.stream(scan.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        Map<Double, Integer> numMap = new TreeMap<>(); 

        for(int i = 0; i < listNum.size(); i++){
            double currentNum = listNum.get(i);
            if(numMap.containsKey(currentNum)){

                numMap.put(currentNum, numMap.get(currentNum + 1));


            }
            else{
                numMap.put(currentNum, 1);
            }
        }

        for (Map.Entry<Double, Integer> entry : numMap.entrySet()) {
            System.out.printf("%.0f -> %d%n",entry.getKey(),entry.getValue());
        }
    }
}
