package OOP.Inheritance.Animals;

public class Dog extends Animal{
    public Dog(String name, int age, String gender) {
        super(name, age, gender);
    }
    public void produceSound(){
        System.out.println("Woof!");
    }
}
