package pl.exercise.ferry.screen.menu;

import pl.exercise.ferry.Cruise;
import pl.exercise.ferry.Factory;
import pl.exercise.ferry.vehicle.VehicleType;

import java.util.Scanner;

public class TicketScreen {
    Cruise cruise;

    public TicketScreen(Cruise cruise) {
        this.cruise = cruise;
    }

    Scanner in = new Scanner(System.in);
    public int interact(){
        System.out.println("Do you want to buy ticket for a (1)person or (2)vehicle ?");
        while(true){
            int i = in.nextInt();
            if(i==1){
                 personTicket();
                 break;
            }
            else if(i==2){
                 vehicleTicket();
                 break;
            }

        }
        System.out.println();
        return 0;
    }

    private void vehicleTicket() {
        System.out.println("Vehicles types: \n" +
                "[1]Car - 20zł \n" +
                "[2]Motorcycle - 10zł \n" +
                "[3]HeavyTruck - 10 zł for ton \n" +
                "[4]Bus - 5zł for meter");
        while(true){
            System.out.println("Whats vehicle's owner name?");
            String name = in.nextLine();
            String name2 = in.nextLine();
            System.out.println("What vehicle type do you want to carry?  ");
            int n = in.nextInt();
            if(n ==1 ) cruise.addVehicle(Factory.getCar(VehicleType.CAR, name2));
            else if (n==2) cruise.addVehicle(Factory.getBike(VehicleType.BIKE,name2));
            else if (n==3) {
                System.out.println("whats weight of the truck ? ");
                int weight = in.nextInt();
                cruise.addVehicle(Factory.getTruck(VehicleType.TRUCK,name2,weight));
            }
            else if(n==4) {
                System.out.println("whats bus length ?");
                int length = in.nextInt();
                cruise.addVehicle(Factory.getBus(VehicleType.BUS,name,length));
            }
            System.out.println("Do you want to add next vehicle? [0]No or [1]Yes");
            int i = in.nextInt();
            if(i == 1) continue;
            else break;
        }

    }

    private void personTicket() {
        System.out.println("Ticket prizes: \n" +
                "[2]To 3 years old - 0zł \n" +
                "[3]Age From 3 to 18 years old - 5zł \n" +
                "[4]Age From 18 to 70 years old - 10zł \n" +
                "[5]Age From 70 - 5zł");
        while(true){
            System.out.println("whats person's age ?");
            int age = in.nextInt();
            cruise.addPerson(Factory.getPerson(age));
            System.out.println("Do you want to add next person? [0]No or [1]Yes");
            int i = in.nextInt();
            if(i == 1) continue;
            else break;
        }

    }
}