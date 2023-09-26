import java.util.*;

public class DateFormatVerifier {
    private String date; // the date string to verify

    public DateFormatVerifier(String date) {
        this.date = date;
    }

    public int getDay() {
        String temp = date.substring(0, 2); // extract the day substring
        return Integer.parseInt(temp); // convert the substring to an integer
    }

    public int getMonth() {
        String temp = date.substring(3, 5); // extract the month substring
        return Integer.parseInt(temp); // convert the substring to an integer
    }

    public int getYear() {
        String temp = date.substring(6); // extract the year substring
        return Integer.parseInt(temp); // convert the substring to an integer
    }

    public boolean isFirstSlashExists() {
        return date.charAt(2) == '/';
    }

    public boolean isSecondSlashExists() {
        return date.charAt(5) == '/';
    }

    public boolean isValidDay() {
        int day = getDay();
        int month = getMonth();
        int year = getYear();
        if (day < 1 || day > 31) {
            return false;
        }
        if (month == 2 && day > 29) {
            return false;
        } else if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
            return false;
        } else if (month == 2 && day == 29 && !isLeapYear(year)) {
            return false;
        }
        return true;
    }

    public boolean isValidDayCount() {
        return date.substring(0, 2).length() == 2;
    }

    public boolean isValidDayWithRespectToMonth() {
        int day = getDay();
        int month = getMonth();
        if (day == 31 && (month == 4 || month == 6 || month == 9 || month == 11)) {
            return false;
        } else if (month == 2 && day > 29) {
            return false;
        }
        return true;
    }

    public boolean isValidMonth() {
        int month = getMonth();
        return month >= 1 && month <= 12;
    }

    public boolean isValidMonthCount() {
        return date.substring(3, 5).length() == 2;
    }

    public boolean isValidYear() {
        int year = getYear();
        return year >= 1900 && year <= 2100;
    }

    public boolean isValidYearCount() {
        return date.substring(6).length() == 4;
    }

    public boolean isValidDateFormat() {
        return date != null && date.length() == 10 && isFirstSlashExists() && isSecondSlashExists() &&
                isValidDay() && isValidDayCount() && isValidDayWithRespectToMonth() &&
                isValidMonth() && isValidMonthCount() && isValidYear() && isValidYearCount();
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}