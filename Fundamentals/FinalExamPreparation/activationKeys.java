package finalPrep;
import java.util.*;

public class activationKeys {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        String input = scan.nextLine();
        String commandLine = scan.nextLine();
        while(!commandLine.equals("Generate")){
            String[] data = commandLine.split(">>>");
            String command = data[0];
            switch(command){

                case "Contains":
                
                if(input.contains(data[1])){
                    System.out.printf("%s contains %s%n", input,data[1]);
                } else {
                    System.out.println("Substring not found!");
                }

                break;

                case "Flip":
                String side = data[1];
                if(side.equals("Upper")){
                    String substring = input.substring(Integer.parseInt(data[2]),Integer.parseInt(data[3]));
                    String toUpperCase = substring.toUpperCase();
                    input = input.replace(substring, toUpperCase);
                    System.out.println(input);
                }
                else if(side.equals("Lower")) {
                    String substring = input.substring(Integer.parseInt(data[2]),Integer.parseInt(data[3]));
                    String toLowerCase = substring.toLowerCase();
                    input = input.replace(substring, toLowerCase);
                    System.out.println(input);
                }
                break;

                case "Slice":
                int start = Integer.parseInt(data[1]);
                int end = Integer.parseInt(data[2]);
                String toDelete = input.substring(start, end);

                input = input.replace(toDelete, "");
                System.out.println(input);
                break;

            }

            commandLine = scan.nextLine();
        }
        System.out.printf("Your activation key is: %s",input);
    }
}
