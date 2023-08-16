package OOP.Encapsulation.AnimalFarm;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        try {
            Chiken chiken = new Chiken(name,age);
            System.out.println(chiken);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
