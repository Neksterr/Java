package MidExam;
import java.util.*;
import java.util.stream.Collectors;

import javax.security.auth.login.CredentialException;
public class manOwar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] pirateShipList = Arrays.stream(scan.nextLine().split(">")).mapToInt(Integer::parseInt).toArray();
        int[] warshipList = Arrays.stream(scan.nextLine().split(">")).mapToInt(Integer::parseInt).toArray();
        int maxHealth = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();

        while(!input.equals("Retire")){
            String[] data = input.split(" ");
            String command = data[0];
            switch(command){
                case "Fire":
                int fireIndex = Integer.parseInt(data[1]);
                int fireDamage = Integer.parseInt(data[2]);
                if(fireIndex >= 0 && fireIndex < warshipList.length){
                   warshipList[fireIndex] -= fireDamage;
                   if(warshipList[fireIndex] <= 0 ){
                    System.out.println("You won! The enemy ship has sunken.");
                    return;
                   }
                }
                break;
                case "Defend":
                int startIndex = Integer.parseInt(data[1]);
                int endIndex = Integer.parseInt(data[2]);
                int damage = Integer.parseInt(data[3]);
                if(startIndex >= 0 && startIndex <= endIndex && endIndex < pirateShipList.length){
                    for(int i = startIndex; i <= endIndex; i++){
                        pirateShipList[i] -= damage;
                        if(pirateShipList[i] <= 0 ){
                            System.out.println("You lost! The pirate ship has sunken.");
                            return;
                        }
                    }
                }
                break;
                case "Repair":
                int reapirIndex = Integer.parseInt(data[1]);
                int repairHealth = Integer.parseInt(data[2]);
                if(reapirIndex >= 0 && reapirIndex < pirateShipList.length){
                    pirateShipList[reapirIndex] += repairHealth;
                    if(pirateShipList[reapirIndex] > maxHealth){
                        pirateShipList[reapirIndex] = maxHealth;
                    }

                }
                break;
                case "Status":
                double perc = maxHealth * 0.2;
                int count = 0;
                for (int section : pirateShipList) {
                    if(section < perc) {
                        count++;
                    }
                }
                System.out.printf("%d sections need repair.\n", count);
                break;
            }


            input = scan.nextLine();
        }
        System.out.printf("Pirate ship status: %d\n", Arrays.stream(pirateShipList).sum());
        System.out.printf("Warship status: %d\n", Arrays.stream(warshipList).sum());

    }
}
