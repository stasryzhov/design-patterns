package com.company.solid.ocp.violation;

public class Printer {

  public void print(String text, Mode mode) {

    switch (mode) {
      case CONGRATS:
        System.out.println("Congratulations!!! " + text + "\nHurray!!!");
        break;
      case OFFICIAL:
        System.out.println("Top Secret: " + text);
        break;
      default:
        System.out.println(text);
        break;
    }
  }

  enum Mode {
    CONGRATS,
    OFFICIAL
  }
}
