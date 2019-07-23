package pl.exercise.ferry.transport;

public class Bike extends Vehicle {
    public Bike(VehicleType vehicleType, String owner) {
        super(vehicleType, owner);
    }

    @Override
    public int getPrize(){
        return 10;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
