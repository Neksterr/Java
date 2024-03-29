package definingClasses.carInfo;

public class Car {
    public String brand;
    public String model;
    public int power;
  
    public Car(String brand) {
        this(brand, "unknown", -1);
    }
    public Car(String brand, String model, int power) {
        this.brand = brand;
        this.model = model;
        this.power = power;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public String carInfo(){
        return String.format("The car is: %s %s - %d HP.",this.brand,this.model,this.power );
    }
    
}
