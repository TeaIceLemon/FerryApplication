package pl.exercise.ferry.screen.menu;

import java.util.Scanner;

public class MainScreen implements Screen {


  private final Scanner in = new Scanner(System.in);

  public int interact() {
    System.out.println("hello what you want to do ? ");
    System.out.println("0. Return to main menu\n" +
    "1. Buy a ticket\n" +
     "2.Get current cruise prize");
    int i = in.nextInt();
    return i;
  }
}

