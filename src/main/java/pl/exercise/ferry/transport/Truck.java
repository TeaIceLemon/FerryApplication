package pl.exercise.ferry.transport;

public class Truck extends Vehicle {
    private int weight;

    public Truck(VehicleType vehicleType, String owner, int weight) {
        super(vehicleType, owner);
        this.weight = weight;
    }


    public int getWeight() { return weight; }

    @Override
    public int getPrize(){
        return 10 *getWeight();
    }



    @Override
    public String toString() {
        return super.toString() + " ,Weight: " + getWeight();
    }
}
