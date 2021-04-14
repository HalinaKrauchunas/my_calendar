package com.epam.test25;

import com.epam.test25.exception.*;

public class DateValidationService {

    private final PrinterService printerService;

    public void validate(Date date) {

        if (date.getYear() < 1) {
            String message = "Data is not valid because the year number cannot be less than 1";
            printerService.print(message);
            throw new ValidatorException(message);
        }
        if (date.getMonth() < 1 || date.getMonth() > 12) {
            String message = "Data is not valid because month number have to be within [1-12]";
            printerService.print(message);
            throw new ValidatorException(message);
        }
        validateDayNumberInMonth(date);
    }

    public void validateDayNumberInMonth(Date date) {

        int day = date.getDay();
        int month = date.getMonth();
        int year = date.getYear();

        int maxDaysNumberInMonthDayNumberInMonth = MonthUtils.getMaxDaysNumberInMonth(month, year);
        if (day > maxDaysNumberInMonthDayNumberInMonth) {
            String message =
                "Date is not valid because the max number of days in a month " + month
                    + " is " + maxDaysNumberInMonthDayNumberInMonth;
            printerService.print(message);
            throw new ValidatorException(message);
        }
    }

    public DateValidationService(PrinterService printerService) {

        this.printerService = printerService;
    }
}

