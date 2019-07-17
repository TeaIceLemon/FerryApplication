package pl.exercise.ferry.screen.menu;

import pl.exercise.ferry.CruiseInfo;



import java.util.Scanner;

public class MainScreen implements Screen {
  private final CruiseInfo cruiseInfo;
  private final Scanner in = new Scanner(System.in);

  public MainScreen(CruiseInfo cruiseInfo) {
    this.cruiseInfo = cruiseInfo;
  }

  public int interact() {
      if(cruiseInfo.getName().isEmpty()){
          System.out.println("How would you like to name your cruise?");
          cruiseInfo.setName(in.nextLine());
      }
    System.out.println("What you want to do ? ");
    System.out.println("0. Return to main menu\n" +
            "1. Buy a ticket\n" +
            "2. Get current cruise prize\n" +
            "3. Show current information\n" +
            "4. Write current information to file\n" +
            "5. Show previous cruise info");

    int i = in.nextInt();
    return i;
  }
}

