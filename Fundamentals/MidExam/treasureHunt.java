package MidExam;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class treasureHunt {
   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    List<String> chestList = Arrays.stream(scan.nextLine().split("\\|")).collect(Collectors.toList());
    String input = scan.nextLine();
    List<String> stolenList = new ArrayList<>();
    while(!input.equals("Yohoho!")){
        String[] data = input.split("\\s");
        String command = data[0];
        switch(command){
            case "Loot":
            for(int i = 1 ; i < data.length ; i++){
                if(!chestList.contains(data[i])){
                    chestList.add(0, data[i]);
                }
            }
            break;
            case "Drop":
            int index = Integer.parseInt(data[1]);
            if(index >= 0 && index <= chestList.size()){
                chestList.add(chestList.get(index));
                chestList.remove(index);
            }
            break;
            case "Steal":
            int count = Integer.parseInt(data[1]);
            if(count > chestList.size()){
                count = chestList.size();
            }

            for(int i = 0 ; i < count ; i++){
                stolenList.add(0,chestList.get(chestList.size() - 1));
                chestList.remove(chestList.size() - 1);
            }
            System.out.println(stolenList.toString().replaceAll("[\\[\\]]", ""));
            break;
        }

        input = scan.nextLine();
    }
    if(chestList.size() == 0){
        System.out.println("Failed treasure hunt.");
    } else {
        int sumLen = 0;
        for (String item : chestList) {
            sumLen += item.length();
            
        }
        System.out.printf("Average treasure gain: %.2f pirate credits.",sumLen / (double)chestList.size());

    }
   }
}
