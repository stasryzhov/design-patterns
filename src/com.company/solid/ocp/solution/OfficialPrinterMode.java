package com.company.solid.ocp.solution;

public class OfficialPrinterMode implements PrinterMode {

    @Override
    public String getPrefix() {
        return "Top Secret: ";
    }

    @Override
    public String getPostfix() {
        return "";
    }
}
