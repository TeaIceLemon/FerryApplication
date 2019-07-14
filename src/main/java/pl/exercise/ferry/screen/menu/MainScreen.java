package pl.exercise.ferry.screen.menu;

import java.util.Scanner;

public class MainScreen implements Screen {


  private final Scanner in = new Scanner(System.in);

  public String cruiseStart(){
    System.out.println("----------------");
    String name = in.nextLine();
    return name;
  }
  public int interact() {
    System.out.println("What you want to do ? ");
    System.out.println("0. Return to main menu\n" +
            "1. Buy a ticket\n" +
            "2. Get current cruise prize\n" +
            "3. Show current information");

    int i = in.nextInt();
    return i;
  }
}

