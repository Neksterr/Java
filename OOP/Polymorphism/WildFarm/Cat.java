package OOP.Polymorphism.WildFarm;

public class Cat extends Feline {
    private String breed;

    public Cat(String animalName, Double animalWeight, Integer foodEaten, String breed) {
        super(animalName, "Cat", animalWeight, foodEaten);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowww");
    }

    @Override
    public void eat(Food food) {

    }

    @Override
    public String toString() {
        return String.format("%s[%s, , %s %s, %s, %d]", getAnimalType(),getAnimalName(),breed, getDf().format(getAnimalWeight()), getLivingRegion(), getFoodEaten());
    }
}
