package com.epam.test25;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        PrinterService printerService = new SystemConsolePrinter();

        UserInputService userInputService = new SystemConsoleUserInputService();

        DateParsingService dateParsingService = new DateParsingService(printerService);
        DateValidationService dateValidationService = new DateValidationService(printerService);

        DateFactory dateFactory = new DateFactory(dateParsingService, dateValidationService);

        DateInputService dateInputService = new DateInputService(userInputService, printerService, dateFactory);

        Date date;
        do {
            date = dateInputService.askUserToInputDate();
        }
        while (Objects.isNull(date));

        ValuesImportantDays valuesImportantDays = new ValuesImportantDays();
        CalendarService calendarService = new CalendarService(valuesImportantDays.getImportantDays(), printerService);
        calendarService.printHoliday(date);
    }
}

