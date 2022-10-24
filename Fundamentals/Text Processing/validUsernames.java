package textProcessing;
import java.util.*;

public class vailidUsernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(", ");
        StringBuilder sb = new StringBuilder();
        for(String username : input){

            if(username.length() >= 3 && username.length() <= 16){
                for (char symbol : username.toCharArray()) {
                    if(Character.isDigit(symbol) || symbol == '-' || symbol == '_' || Character.isLetter(symbol)){
                        sb.append(symbol);
                        
                    }
                }
            }
            if(sb.length() == username.length()){
                System.out.println(username);
            }
            sb.setLength(0);
        }
        
    }
}
