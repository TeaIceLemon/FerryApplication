package pl.exercise.ferry;

import pl.exercise.ferry.person.Person;
import pl.exercise.ferry.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Cruise {
    List<Person> personList = new ArrayList<>();
    List<Vehicle> vehicleList = new ArrayList<>();

    public void addPerson(Person person){
        personList.add(person);
    }
    public void addVehicle(Vehicle vehicle){
        vehicleList.add(vehicle);
    }

    public int getCruisePrize(){
        int prize =0;
        for(Person person : personList){
            prize += person.getPrize();
        }
        for(Vehicle vehicle : vehicleList){
            prize+= vehicle.getPrize();
        }
        return prize;
    }
}
