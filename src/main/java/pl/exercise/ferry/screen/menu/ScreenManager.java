package pl.exercise.ferry.screen.menu;

import pl.exercise.ferry.CruiseInfo;

public class ScreenManager {
    CruiseInfo cruiseInfo = new CruiseInfo();
    MainScreen mainScreen= new MainScreen(cruiseInfo);
    TicketScreen ticketScreen = new TicketScreen(cruiseInfo);
    FileScreen fileScreen = new FileScreen(cruiseInfo);

    private int chosenScreen =0;


    public void start(){
        System.out.println("Welcome to our cruise ship!! \n");
        manage();
    }
    public void manage(){
        while(true){
            chosenScreen = choseScreen(chosenScreen);
        }
    }

    private int choseScreen(int chosenScreen) {
        if(chosenScreen == 0){
            return mainScreen.interact();
        }
        else if(chosenScreen ==1){
            return  ticketScreen.interact();
        }
        else if(chosenScreen ==2){
            System.out.println("Current prize for a cruise is: " + cruiseInfo.getCruisePrize());
            return 0;
        }
        else if(chosenScreen ==3){
            System.out.println(cruiseInfo.toString());
            return 0;
        }
        else if(chosenScreen ==4){
            fileScreen.fileWriter(cruiseInfo.getName(),cruiseInfo.toString());
            return 0;
        }
        else return 0;

    }
}
