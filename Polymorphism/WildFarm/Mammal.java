package OOP.Polymorphism.WildFarm;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    private String livingRegion;
    private DecimalFormat df =new DecimalFormat("#.##");

    public Mammal(String animalName, String animalType, Double animalWeight, Integer foodEaten) {
        super(animalName, animalType, animalWeight, foodEaten);
    }

    @Override
    public String toString() {
        return String.format("%s[%s, %s, %s, %d]", getAnimalType(),getAnimalName(), df.format(getAnimalWeight()), livingRegion, getFoodEaten());
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    protected DecimalFormat getDf(){
        return df;
    }
}
