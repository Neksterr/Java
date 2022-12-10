package setsAndMapsAdv;
import java.util.*;
public class uniqueUsernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<String> namesSet = new LinkedHashSet<>();
        int n = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < n ; i++){
            String name = scan.nextLine();
            if(!namesSet.contains(name)){
                namesSet.add(name);
            }
        }
        for (String e : namesSet) {
            System.out.println(e);
            
        }
    }
}
