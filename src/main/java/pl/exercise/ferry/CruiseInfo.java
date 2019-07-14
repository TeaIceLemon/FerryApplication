package pl.exercise.ferry;

import pl.exercise.ferry.transport.Person;
import pl.exercise.ferry.transport.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class CruiseInfo {
    List<Person> personList = new ArrayList<>();
    List<Vehicle> vehicleList = new ArrayList<>();
    StringBuilder stringBuilder = new StringBuilder();
    String name = "";

    public void addPerson(Person person){
        personList.add(person);
    }
    public void addVehicle(Vehicle vehicle){
        vehicleList.add(vehicle);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    public String toString(){
        stringBuilder.append("Cruise name: " + getName() + "\n");
        stringBuilder.append("People: \n");
        for(Person person : personList){
            stringBuilder.append(person.toString() + "\n");
        }
        stringBuilder.append("\nVehicles: \n");
        for(Vehicle vehicle : vehicleList){
            stringBuilder.append(vehicle.toString()+ "\n");
        }
        return stringBuilder.toString();
    }
}
