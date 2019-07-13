package pl.exercise.ferry.vehicle;

public class Truck extends Vehicle {
    private int weight;
    public Truck(VehicleType vehicleType, String owner, int weight) {
        super(vehicleType, owner);
        this.weight = weight;
    }
    public int getPrize(){
        return 10 *weight;
    }
}
