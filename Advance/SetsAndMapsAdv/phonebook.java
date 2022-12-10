package setsAndMapsAdv;
import java.util.*;
public class phonebook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Map<String,String> phonebookMap = new LinkedHashMap<>();
        while(!input.equals("search")){
            String[] data = input.split("-");
            String name = data[0];
            String number = data[1];
            phonebookMap.put(name, number);
            input = scan.nextLine();
        }
        input = scan.nextLine();
        while(!input.equals("stop")){
            if(phonebookMap.containsKey(input)){
                System.out.printf("%s -> %s%n", input, phonebookMap.get(input));
            } else {
                System.out.printf("Contact %s does not exist.%n", input);
            }
            input = scan.nextLine();
        }
    }
}
