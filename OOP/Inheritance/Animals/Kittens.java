package OOP.Inheritance.Animals;

public class Kittens extends Cat{

    public Kittens(String name, int age) {
        super(name, age, "Female");
    }
    public void produceSound(){
        System.out.println("Meow");
    }
}
