package com.epam.test25;

import com.epam.test25.exception.*;

import java.util.*;
import java.util.regex.*;

public class DateParsingService {

    public static final Pattern DATE_FORMAT_REGEXP_PATTERN = Pattern.compile("[0-9]{2}/[0-9]{2}/[0-9]{4}");

    private final PrinterService printerService;

    public Date parse(String dateString) {

        if (Objects.isNull(dateString)) {
            String message = "Cannot parse date because input string is null";
            printerService.print(message);
            throw new ValidatorException(message);
        }

        boolean isValidFormat = DATE_FORMAT_REGEXP_PATTERN.matcher(dateString).matches();
        if (!isValidFormat) {
            String message = "Cannot parse date because input string format is invalid";
            printerService.print(message);
            throw new ValidatorException(message);
        }

        String[] inputDateSplit = dateString.split("/");
        int day = Integer.parseInt(inputDateSplit[0]);
        int month = Integer.parseInt(inputDateSplit[1]);
        int year = Integer.parseInt(inputDateSplit[2]);

        return new Date(day, month, year);
    }

    public DateParsingService(PrinterService printerService) {

        this.printerService = printerService;
    }
}
