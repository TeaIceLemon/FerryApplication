package pl.exercise.ferry;

import pl.exercise.ferry.transport.Merchandise;
import pl.exercise.ferry.transport.Person;
import pl.exercise.ferry.transport.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class CruiseInfo {
    private List<Person> personList = new ArrayList<>();
    private List<Vehicle> vehicleList = new ArrayList<>();
    private List<Merchandise> merchandiseList = new ArrayList<>();
    private StringBuilder stringBuilder = new StringBuilder();
    private String name = "";
    private int capacity = 1000;

    public void addPerson(Person person){
        personList.add(person);
    }
    public void addVehicle(Vehicle vehicle){
        vehicleList.add(vehicle);
    }
    public void addMerchandise(Merchandise merchandise) {merchandiseList.add(merchandise);}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCruisePrize(){
        int prize =0;
        for(Person person : personList){
            prize += person.getPrize();
        }
        for(Vehicle vehicle : vehicleList) {
            prize += vehicle.getPrize();
        }
        for(Merchandise merchandise : merchandiseList){
            prize+= merchandise.getPrice();
        }
        return prize;
    }
    @Override
    public String toString(){
        stringBuilder.append("Cruise name: " + getName() + "\n");
        stringBuilder.append("People: \n");
        if (personList.size()>0){
            for(Person person : personList){
                if(person ==null){
                    continue;
                }
                stringBuilder.append(person.toString() + "\n");
            }
        }
        if(vehicleList.size()>0){
            stringBuilder.append("\nVehicles: \n");
            for(Vehicle vehicle : vehicleList){
                if(vehicle==null) {
                    continue;
                }
                stringBuilder.append(vehicle.toString()+ "\n");
            }
        }
        if(merchandiseList.size()>0){
            stringBuilder.append("\n Merchandise: \n");
            for(Merchandise merchandise : merchandiseList){
                if(merchandise ==null){
                    continue;
                }
                stringBuilder.append((merchandise.toString() + "\n"));
            }
        }
        return stringBuilder.toString();
    }
}
