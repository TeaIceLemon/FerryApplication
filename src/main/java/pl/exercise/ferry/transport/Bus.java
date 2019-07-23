package pl.exercise.ferry.transport;

public class Bus extends Vehicle {
    private int length;
    public Bus(VehicleType vehicleType, String owner, int length) {
        super(vehicleType, owner);
        this.length = length;
    }

    public int getLength() { return length; }

    @Override
    public int getPrize(){ return 5*getLength(); }

    @Override
    public String toString() {
        return super.toString() + " ,Length:" + length;
    }
}
