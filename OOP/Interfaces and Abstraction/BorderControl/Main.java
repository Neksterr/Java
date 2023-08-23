package OOP.InterfacesAndAbstraction.BorderControl;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        List<Identifiable> identifiables = new ArrayList<>();
        while (!input.equals("End")){
            String[] info = input.split(" ");
            Identifiable identifiable =info.length == 2 ? new Robot(info[0], info[1])
                                                        : new Citizen(info[0], Integer.parseInt(info[1]), info[2]);


            identifiables.add(identifiable);

            input = scan.nextLine();
        }
        String fakeIdPostFix =  scan.next();

        identifiables.stream().map(Identifiable::getId).filter(i -> i.endsWith(fakeIdPostFix)).forEach(System.out::println);
    }
}
