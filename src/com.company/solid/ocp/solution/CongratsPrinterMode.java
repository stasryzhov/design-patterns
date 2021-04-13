package com.company.solid.ocp.solution;

public class CongratsPrinterMode implements PrinterMode {

  @Override
  public String getPrefix() {
    return "Congratulations!!! ";
  }

  @Override
  public String getPostfix() {
    return "\nHurray!!!";
  }
}
