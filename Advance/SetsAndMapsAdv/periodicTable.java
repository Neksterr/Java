package setsAndMapsAdv;
import java.util.*;
public class periodicTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Set<String> chemicalSet = new TreeSet<>();
        for(int i = 0; i < n ; i++){
            String[] chemicals = scan.nextLine().split(" ");
           Collections.addAll(chemicalSet, chemicals);
        }
        String result = String.join(" ", chemicalSet);
        System.out.println(result);
    }
}
