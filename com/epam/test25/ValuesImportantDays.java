package com.epam.test25;

import java.util.*;

public class ValuesImportantDays {

    private final Collection<CalendarService.ImportantDates> importantDates;

    public Collection<CalendarService.ImportantDates> getImportantDays() {

        return importantDates;
    }

    public ValuesImportantDays() {

        this.importantDates = Arrays.asList(
            new CalendarService.ImportantDates(3, 11, "My birthday"),
            new CalendarService.ImportantDates(16, 11, "Birthday my brother"),
            new CalendarService.ImportantDates(11, 7, "Birthday my friend"),
            new CalendarService.ImportantDates(31, 12, "New Year"));
    }
}
