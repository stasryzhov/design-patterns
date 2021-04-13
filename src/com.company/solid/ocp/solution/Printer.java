package com.company.solid.ocp.solution;

public class Printer {

  public void print(String text, PrinterMode mode) {
    String prefix = mode.getPrefix();
    String postfix = mode.getPostfix();

    System.out.println(prefix + text + postfix);
  }
}
