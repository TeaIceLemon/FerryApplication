package pl.exercise.ferry.screen.menu;

import pl.exercise.ferry.Cruise;

public class ScreenManager {
    Cruise cruise = new Cruise();
    MainScreen mainScreen= new MainScreen();
    TicketScreen ticketScreen = new TicketScreen(cruise);

    int chosenScreen =0;

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
            System.out.println(cruise.getCruisePrize());
            return 0;
        }
        else return 0;

    }
}
