package pl.exercise.ferry.transport;

public abstract class Vehicle {
  private final VehicleType vehicleType;
  private final String owner;

  Vehicle(VehicleType vehicleType, String owner) {
    this.vehicleType = vehicleType;
    this.owner = owner;
  }
  public int getPrize(){
    return 0;
  }

  public String toString(){
    return "Vehicle: " + vehicleType + " ,Owner: " + owner + " ,Prize for transport: " + getPrize();
  }
}
