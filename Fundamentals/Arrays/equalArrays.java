import java.util.*;;
public class equalArr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] firstArr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
        int[] secondArr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
        boolean equal = true; int diff = 0; int sum = 0;
        if(firstArr.length != secondArr.length){
            equal = false;
        }else {
        for(int i = 0; i < firstArr.length; i ++){
            if(firstArr[i] != secondArr[i]){
                equal = false;
                diff = i;
                break;
            } else {
                sum += firstArr[i];
            }


        }
        if(equal){
            System.out.printf("Arrays are identical. Sum: %s", sum);
        }else{

            System.out.printf("Arrays are not identical. Found difference at %d index.", diff);
        }
    }
    }
    
}
