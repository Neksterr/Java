package AssociativeArrays;
import java.util.*;

import basic.padawanEquipment;
public class softuniParking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lines = Integer.parseInt(scan.nextLine());Map<String,String> parkingMap = new LinkedHashMap<>();
        for(int i = 0; i < lines; i++){
            String[] data = scan.nextLine().split(" ");
            String username = data[1];
            
            switch(data[0]){

                case "register":
                String licensePlate = data[2];
                if(!parkingMap.containsKey(username)){
                    parkingMap.put(username, licensePlate);
                    System.out.printf("%s unregistered successfully%n",username);
                }
                else{
                    System.out.printf("ERROR: already registered with plate number %s%n",licensePlate);
                }
                break;

                case "unregister":
                if(!parkingMap.containsKey(username)){
                    System.out.printf("ERROR: user %s not found%n",username);
                } else {
                    parkingMap.remove(username);
                    System.out.printf("%s unregistered successfully%n",username);
                }
                break;
            }
        }
        parkingMap.entrySet().forEach(entry -> System.out.printf("%s => %s%n", entry.getKey(),entry.getValue()));

    }
}
