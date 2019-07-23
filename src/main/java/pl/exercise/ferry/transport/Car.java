package pl.exercise.ferry.transport;

public class Car extends Vehicle {
    public Car(VehicleType vehicleType, String owner) {
       super(vehicleType, owner);
    }

    @Override
    public int getPrize(){
        return 20;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
