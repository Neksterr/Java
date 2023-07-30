package OOP.WorkingWithAbstraction.StudentSystem;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StudentSystem studentSystem = new StudentSystem();
        while (true){
            String[] input = scan.nextLine().split("\\s+" );
            if(input[0].equals("Exit")){
                break;
            }
            studentSystem.ParseCommand(input);
        }
    }
}
