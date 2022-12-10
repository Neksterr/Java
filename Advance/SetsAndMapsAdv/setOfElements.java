package setsAndMapsAdv;
import java.util.*;
public class setOfElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        int nums1 = Integer.parseInt(input[0]);
        int nums2 = Integer.parseInt(input[1]);
        Set<String> firstSet = new LinkedHashSet<>();
        Set<String> secondSet = new LinkedHashSet<>();
        for(int i = 0; i< nums1; i++){
            String n = scan.nextLine();
            firstSet.add(n);
        }
        for(int i = 0; i< nums2; i++){
            String m = scan.nextLine();
            secondSet.add(m);
        }
        firstSet.retainAll(secondSet);
        System.out.println(String.join(" ", firstSet));
    }
}
