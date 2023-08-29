package OOP.Polymorphism.Vehicles;

public class Car extends AbstractVehicles {
    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
    }

    @Override
    public String driving(double distance) {
        double consumption = distance * (getFuelConsumption() + 0.9);
        return travelling(distance, consumption);
    }

    @Override
    public void refuel(double liters) {
        setFuelQuantity(getFuelQuantity() + liters);
    }

}
