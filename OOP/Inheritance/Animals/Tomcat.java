package OOP.Inheritance.Animals;

public class Tomcat extends Cat{

    public Tomcat(String name, int age) {
        super(name, age, "Male");
    }
    public void produceSound(){
        System.out.println("MEOW");
    }
}
