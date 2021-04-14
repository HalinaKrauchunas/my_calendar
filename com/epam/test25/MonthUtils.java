package com.epam.test25;

public class MonthUtils {

    public static int getMaxDaysNumberInMonth(int month, int year) {

        if (month == Month.JANUARY.getNumber() ||
            month == Month.MARCH.getNumber() ||
            month == Month.MAY.getNumber() ||
            month == Month.JULY.getNumber() ||
            month == Month.AUGUST.getNumber() ||
            month == Month.OCTOBER.getNumber() ||
            month == Month.DECEMBER.getNumber()) {
            return 31;
        }

        if (month == Month.APRIL.getNumber() ||
            month == Month.JUNE.getNumber() ||
            month == Month.SEPTEMBER.getNumber() ||
            month == Month.NOVEMBER.getNumber()) {
            return 30;
        }

        if (month == Month.FEBRUARY.getNumber()) {
            boolean isLeap = year % 4 == 0;
            if (isLeap) {
                return 29;
            } else {
                return 28;
            }
        }
        return -1;
    }
}