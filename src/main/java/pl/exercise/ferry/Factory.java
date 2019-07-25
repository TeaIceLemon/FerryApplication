package pl.exercise.ferry;

import pl.exercise.ferry.transport.Person;
import pl.exercise.ferry.transport.*;

public class Factory {
    public static Person getPerson(int age, String name,int capacity, int personCapacity) {
        if(capacity-personCapacity<0){
            System.out.println("There is no more space to buy ticket for that cruise.\n" +
                    "Please wait for next cruise ");
            return null;
        }
        else if(age>0) return new Person(age, name);
        else return null;
    }
    public static Vehicle getCar(VehicleType type, String owner,int capacity, int carCapacity){
        if(capacity-carCapacity<0) {
            System.out.println("There is no more space to buy ticket for that cruise.\n" +
                    "Please wait for next cruise ");
            return null;
        }
        else if(type ==VehicleType.CAR ) return new Car(VehicleType.CAR, owner);
        else return null;
    }
    public static Vehicle getBike(VehicleType type, String owner,int capacity, int bikeCapacity) {
        if(capacity-bikeCapacity<0) {
            System.out.println("There is no more space to buy ticket for that cruise.\n" +
                    "Please wait for next cruise ");
            return null;
        }
        else if(type ==VehicleType.BIKE ) return new Bike(VehicleType.BIKE, owner);
        else return null;
    }
    public static Vehicle getBus(VehicleType type, String owner,int length,int capacity, int busCapacity) {
        if(capacity-busCapacity<0) {
            System.out.println("There is no more space to buy ticket for that cruise.\n" +
                    "Please wait for next cruise ");
            return null;
        }
        else if(type ==VehicleType.BUS ) return new Bus(VehicleType.BUS, owner, length);
        else return null;
    }
    public static Vehicle getTruck(VehicleType type, String owner , int weight,int capacity, int truckCapacity) {
        if(capacity-truckCapacity<0) {
            System.out.println("There is no more space to buy ticket for that cruise.\n" +
                    "Please wait for next cruise ");
            return null;
        }
        else if(type ==VehicleType.TRUCK ) return new Truck(VehicleType.TRUCK, owner,weight);
        else return null;
    }
    public static Merchandise getMerchandise(String name, int volume,int capacity, int merchandiseCapacity){
        if(capacity-(merchandiseCapacity*volume)<0) {
            System.out.println("There is no more space to buy ticket for that cruise.\n" +
                    "Please wait for next cruise ");
            return null;
        }
        if(!name.isEmpty() && volume>0) return new Merchandise(name , volume);
        else return null;
    }
}
