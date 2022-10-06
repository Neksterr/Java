package ObjectsAndClasses;
import java.util.*;

import javax.swing.text.StyledEditorKit.FontSizeAction;
public class studentsTask {
    static class Student{
        String firstName;
        String lastName;
        int age;
        String hometown;
        public Student(String firstName,String lastName, int age, String hometown){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.hometown = hometown;
        }
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public void setHometown(String hometown) {
            this.hometown = hometown;
        }
        public String getFirstName() {
            return this.firstName;
        }
        public String getLastName() {
            return this.lastName;
        }
        public int getAge() {
            return this.age;
        }
        public String getHometown() {
            return this.hometown;
        }

        
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String input  = scan.nextLine();
        List<Student> studentsList = new ArrayList<>();
        while(!input.equals("end")){
            String[] data = input.split(" ");
            String firstName = data[0];
            String lastName = data[1];
            int age = Integer.parseInt(data[2]);
            String hometown = data[3];
            Student studentO = new Student(firstName,lastName,age,hometown);
            studentsList.add(studentO);

            input = scan.nextLine();
        }
        String city = scan.nextLine();
        for (Student person : studentsList) {
            if(person.getHometown().equals(city)){
                System.out.printf("%s %s is %d years old\n",person.getFirstName(),person.getLastName(),person.getAge());
            }
        }
    }
}
