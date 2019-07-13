package pl.exercise.ferry.vehicle;

public class Bus extends Vehicle {
    private int length;
    public Bus(VehicleType vehicleType, String owner, int length) {
        super(vehicleType, owner);
        this.length = length;
    }
    public int getPrize(){
        return 5*length;
    }
}
