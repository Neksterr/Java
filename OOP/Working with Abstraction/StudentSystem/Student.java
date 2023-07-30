package OOP.WorkingWithAbstraction.StudentSystem;
import java.util.*;
public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
    public String getInfo(){

        String studentInfo = String.format("%s is %s years old.", this.name, this.age);

        if (this.grade >= 5.00) {
            studentInfo += " Excellent student.";
        } else if (this.grade < 5.00 && this.grade >= 3.50) {
            studentInfo += " Average student.";
        } else {
            studentInfo += " Very nice person.";
        }

        return studentInfo;

    }
}
