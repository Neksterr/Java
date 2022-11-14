package finalPrep;
import java.util.*;
public class thePianist {
    public static class Pianist{
        String composer;
        String piece;
        String key;
        public Pianist(String piece,String composer,  String key) {
            this.composer = composer;
            this.piece = piece;
            this.key = key;
        }
        public String getComposer() {
            return composer;
        }
        public void setComposer(String composer) {
            this.composer = composer;
        }
        public String getPiece() {
            return piece;
        }
        public void setPiece(String piece) {
            this.piece = piece;
        }
        public String getKey() {
            return key;
        }
        public void setKey(String key) {
            this.key = key;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String,Pianist> pianistMap = new LinkedHashMap<>();
        for(int i = 0; i < n ;i++){
            String[] pianistInfo = scan.nextLine().split("\\|");
            String piece = pianistInfo[0];
            String composer = pianistInfo[1];
            String key = pianistInfo[2];
            Pianist pianistObj = new Pianist(piece,composer,  key);
            pianistMap.put(piece, pianistObj);
        }
        String commandLine = scan.nextLine();
        while(!commandLine.equals("Stop")){
            String[] data = commandLine.split("\\|");
            String command = data[0];
            String piece = data[1];

            switch(command){
                case "Add":
                String composer = data[2];
                String key = data[3];
                if(pianistMap.containsKey(piece)){
                    System.out.println(piece + " is already in the collection!");
                } else {
                    Pianist pianistObj = new Pianist(piece, composer, key);
                        pianistMap.put(piece, pianistObj);
                    System.out.printf("%s by %s in %s added to the collection!%n",piece,composer,key);
                }
                break;

                case "Remove":
                if(pianistMap.containsKey(piece)){
                    pianistMap.remove(piece);
                    System.out.printf("Successfully removed %s!%n",piece);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n",piece);
                }
                break;

                case "ChangeKey":
                String newKey = data[2];
                if(pianistMap.containsKey(piece)){
                    pianistMap.get(piece).setKey(newKey);
                    System.out.printf("Changed the key of %s to %s!%n",piece,newKey);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n",piece);
                }
                break;
            }



            commandLine = scan.nextLine();
        }
        pianistMap.forEach((k,v) -> System.out.printf("%s -> Composer: %s, Key: %s%n",v.piece,v.composer,v.key));
    }
}
