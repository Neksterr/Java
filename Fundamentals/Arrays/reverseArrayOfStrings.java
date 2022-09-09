import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;
public class reverseArrayStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] arrStr = scan.nextLine().split(" ");
        for(int i = arrStr.length - 1; i >= 0 ; i--){
            System.out.printf("%s ", arrStr[i]);
        }
    }
    
}
