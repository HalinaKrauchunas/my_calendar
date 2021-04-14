package com.epam.test25;

import java.util.*;

public class CalendarService {

    private final Collection<ImportantDates> importantDates;
    private final PrinterService printerService;

    public void printHoliday(Date date) {

        for (ImportantDates importantDate : importantDates) {
            if (date.getMonth() == importantDate.getMonth() && date.getDay() == importantDate.getDay()) {
                printerService.print(date + " this is " + importantDate.getName());
                return;
            }
        }
        printerService.print("Not a holiday\n");
    }

    public CalendarService(
        Collection<ImportantDates> importantDates,
        PrinterService printerService
    ) {

        this.importantDates = importantDates;
        this.printerService = printerService;
    }

    static class ImportantDates {

        private final int day;
        private final int month;
        public final String name;

        public int getDay() {

            return day;
        }

        public int getMonth() {

            return month;
        }

        public String getName() {

            return name;
        }

        public ImportantDates(int day, int month, String name) {

            this.day = day;
            this.month = month;
            this.name = name;
        }
    }
}
