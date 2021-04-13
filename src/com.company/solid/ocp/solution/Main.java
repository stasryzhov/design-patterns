package com.company.solid.ocp.solution;

public class Main {

  public static void main(String[] args) {
    Printer printer = new Printer();

    printer.print("Hello", new CongratsPrinterMode());
  }
}
