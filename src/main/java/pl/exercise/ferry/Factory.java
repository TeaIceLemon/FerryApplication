package pl.exercise.ferry;

import pl.exercise.ferry.transport.Person;
import pl.exercise.ferry.transport.*;

public class Factory {
    public static Person getPerson(int age, String name) {
        if(age>0) return new Person(age, name);
        else return null;
    }
    public static Vehicle getCar(VehicleType type, String owner){
        if(type ==VehicleType.CAR ) return new Car(VehicleType.CAR, owner);
        else return null;
    }
    public static Vehicle getBike(VehicleType type, String owner) {
        if(type ==VehicleType.BIKE ) return new Bike(VehicleType.BIKE, owner);
        else return null;
    }
    public static Vehicle getBus(VehicleType type, String owner,int length) {
        if(type ==VehicleType.BUS ) return new Bus(VehicleType.BUS, owner, length);
        else return null;
    }
    public static Vehicle getTruck(VehicleType type, String owner , int weight) {
        if(type ==VehicleType.TRUCK ) return new Truck(VehicleType.TRUCK, owner,weight);
        else return null;
    }
    public static Merchandise getMerchandise(String name, int volume){
        if(!name.isEmpty() && volume>0) return new Merchandise(name , volume);
        else return null;
    }
}
