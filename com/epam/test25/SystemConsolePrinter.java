package com.epam.test25;

public class SystemConsolePrinter implements PrinterService {

    @Override
    public void print(String string) {

        System.out.println(string);
    }
}
