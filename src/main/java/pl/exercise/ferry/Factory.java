package pl.exercise.ferry;

import pl.exercise.ferry.person.PaxType;
import pl.exercise.ferry.person.Person;
import pl.exercise.ferry.vehicle.*;

public class Factory {
    public static Person getPerson(int age) {
        if (age <= 5) return new Person(PaxType.CHILD);
        else if (age > 5 && age <= 18) return new Person(PaxType.YOUNG);
        else if (age > 18 && age <= 70) return new Person(PaxType.ADULT);
        else if (age > 70) return new Person(PaxType.SENIOR);
        else return null;
    }
    public static Vehicle getCar(VehicleType type, String owner){
        if(type ==VehicleType.CAR ) return new Car(VehicleType.CAR, owner);
        else return null;
    }
    public static Vehicle getBike(VehicleType type, String owner) {
        if(type ==VehicleType.BIKE ) return new Bike(VehicleType.BIKE, owner);
        return null;
    }
    public static Vehicle getBus(VehicleType type, String owner,int length) {
        if(type ==VehicleType.BUS ) return new Bus(VehicleType.BUS, owner, length);
        return null;
    }
    public static Vehicle getTruck(VehicleType type, String owner , int weight) {
        if(type ==VehicleType.TRUCK ) return new Truck(VehicleType.TRUCK, owner,weight);
        return null;
    }
}
