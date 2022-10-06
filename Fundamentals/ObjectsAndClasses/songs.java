package ObjectsAndClasses;
import java.util.*;
public class songs {
    static class Song{
        String typeList;
        String name;
        String time;

        public void setTypeList(String typeList){
            this.typeList = typeList;
        }
        public void setName(String name){
            this.name = name;
        }
        public void setTime(String time){
            this.time = time;
        }
        public String getTypeList() {
            return this.typeList;
        }
        public String getName() {
            return this.name;
        }
        public String getTime() {
            return this.time;
        }
        

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numSongs = Integer.parseInt(scan.nextLine());
        List<Song> songsList = new ArrayList<>();
        for(int i = 0; i < numSongs; i++){
            String[] data = scan.nextLine().split("_");
            String type = data[0];
            String name = data[1];
            String time = data[2];

            Song currentSong = new Song();
            currentSong.setTypeList(type);
            currentSong.setName(name);
            currentSong.setTime(time);
            songsList.add(currentSong);
        }
        String command = scan.nextLine();
        if(command.equals("all")){
            for (Song item : songsList) {
                System.out.println(item.getName());
            }
        } else{
            for (Song item : songsList) {
                if(item.getTypeList().equals(command)){
                    System.out.println(item.getName());
                }
            }
        }
    }
}
