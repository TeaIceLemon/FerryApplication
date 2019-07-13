package pl.exercise.ferry.vehicle;

public class Bike extends Vehicle {
    public Bike(VehicleType vehicleType, String owner) {
        super(vehicleType, owner);
    }
    public int getPrize(){
        return 10;
    }
}
