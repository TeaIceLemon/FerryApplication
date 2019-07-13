package pl.exercise.ferry.vehicle;

public class Car extends Vehicle {
    public Car(VehicleType vehicleType, String owner) {
       super(vehicleType, owner);
    }
    public int getPrize(){
        return 20;
    }
}
