package ObjectsAndClasses;
import java.util.*;
public class students3 {
    static class Student{
        String firstName;
        String lastName;
        double grade;
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
        public void setGrade(double grade) {
            this.grade = grade;
        }
        public String getFirstName() {
            return this.firstName;
        }
        public String getLastName() {
            return this.lastName;
        }
        public double getGrade() {
            return this.grade;
        }
        public Student(String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }
        @Override
        public String toString() {
            return String.format("%s %s: %.2f", this.firstName,this.lastName,this.grade);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Student> listOfStudents = new ArrayList<>();
        int numStudents = Integer.parseInt(scan.nextLine());
        for(int i = 1; i <= numStudents; i++){
            String[] data = scan.nextLine().split(" ");
            String firstName = data[0];
            String lastName = data[1];
            double grade =Double.parseDouble(data[2]) ;

            Student student = new Student(firstName,lastName,grade);
            listOfStudents.add(student);

        }
        listOfStudents.sort(Comparator.comparing(Student::getGrade).reversed());
        for (Student student : listOfStudents) {
            System.out.println(student);
        }
    }
}
