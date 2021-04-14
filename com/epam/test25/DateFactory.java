package com.epam.test25;

public class DateFactory {

    private final DateParsingService dateParsingService;
    private final DateValidationService dateValidationService;

    public Date createDate(String stringDate) {

        Date date = dateParsingService.parse(stringDate);

        dateValidationService.validate(date);
        return date;
    }

    public DateFactory(
        DateParsingService dateParsingService,
        DateValidationService dateValidationService

    ) {

        this.dateParsingService = dateParsingService;
        this.dateValidationService = dateValidationService;
    }
}
