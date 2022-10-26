package textProcessing;
import java.util.*;
public class extractFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int extention = input.lastIndexOf(".");
        int fileName = input.lastIndexOf("\\" )+ 1;

        String name = input.substring(fileName, extention);
        String ext = input.substring(extention + 1);

        System.out.printf("File name: %s%n",name);
        System.out.printf("File extension: %s%n",ext);
    }
}
