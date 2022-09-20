package methods;
import java.util.*;
public class repeatingString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        int num = Integer.parseInt(scan.nextLine());
        System.out.println(repeatString(text, num));
        

    }
    public static String repeatString(String text,int num){
        String result = "";
        for(int i = 0; i < num; i ++){
            result += text;
        }
        return result;
    }
}
