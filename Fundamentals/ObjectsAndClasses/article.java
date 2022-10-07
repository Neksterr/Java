package ObjectsAndClasses;
import java.util.*;


public class articles {
    static class Article{
        String title;
        String content;
        String author;
        public void setTitle(String title) {
            this.title = title;
        }
        public void setContent(String content) {
            this.content = content;
        }
        public void setAuthor(String author) {
            this.author = author;
        }
        public String getTitle() {
            return this.title;
        }
        public String getContent() {
            return this.content;
        }
        public String getAuthor() {
            return this.author;
        }
        public Article(String title,String content,String author){
            this.title = title;
            this.content = content;
            this.author = author;
        }
        public void changeAuthor(String newAuthor){
            this.author = newAuthor;
        }
        public void editContent( String newContent){
            this.content = newContent;
        }
        public void rename(String newTitle){
            this.title = newTitle;
        }
        @Override
        public String toString() {
            return  this.title + " - " + this.content + ": " + this.author ;
        }

        
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] articleParts = scan.nextLine().split(", ");
        String title = articleParts[0];
        String content = articleParts[1];
        String author = articleParts[2];

        Article artcl = new Article(title, content, author);
        int count = Integer.parseInt(scan.nextLine());
        for(int i = 1; i <= count; i++){
            String command = scan.nextLine();
            String commandName = command.split(": ")[0];
            String newValue = command.split(": ")[1];
            switch(commandName){

                case "Edit":
                artcl.editContent(newValue);
                break;
                case "ChangeAuthor":
                artcl.changeAuthor(newValue);
                break;
                case "Rename":
                artcl.rename(newValue);
                break;
            }

        }
        System.out.println(artcl);
    }
}
