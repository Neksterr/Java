package List;
import java.util.*;
public class listOfProducts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<String> list = new ArrayList<>();

        for(int i = 0; i < n; i++ ){
            String product = scan.nextLine();
            list.add(product);
        }
        Collections.sort(list);
        for(int i = 0; i < list.size(); i++){
            System.out.printf("%d.%s\n",i + 1, list.get(i));
        }
    }
}
