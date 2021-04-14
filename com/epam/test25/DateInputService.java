package com.epam.test25;

import com.epam.test25.exception.*;

public class DateInputService {

    private final UserInputService userInputService;
    private final PrinterService printerService;
    private final DateFactory dateFactory;

    public Date askUserToInputDate() {

        printerService.print("Please, enter a date in the format 'dd/mm/yyyy'. Example: 02/11/1990");
        String dateUserInput = userInputService.readInput();

        try {
            return dateFactory.createDate(dateUserInput);
        } catch (ValidatorException e) {
            printerService.print("Entered invalid date.");
            return null;
        }
    }

    public DateInputService(
        UserInputService userInputService,
        PrinterService printerService,
        DateFactory dateFactory
    ) {

        this.userInputService = userInputService;
        this.printerService = printerService;
        this.dateFactory = dateFactory;
    }
}