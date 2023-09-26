import java.util.Scanner;
class DateFormatVerifier {
    String date;
    public int getDay() {
        String day = date.substring(0, 2);
        return Integer.parseInt(day);
    }
    public int getMonth() {
        String month = date.substring(3, 5);
        return Integer.parseInt(month);
    }
    public int getYear() {
        String year = date.substring(6, 10);
        return Integer.parseInt(year);
    }
    public void input() {
        Scanner scanObj = new Scanner(System.in);
        System.out.println("Enter the date in dd/mm/yyyy format:");
        date = scanObj.nextLine();
    }
    public boolean isFirstSlash() {
        return date.charAt(2) == '/';
    }
    public boolean isSecondSlash() {
        return date.charAt(5) == '/';
    }
    public boolean isValidDay() {
        return (getDay() >= 1 && getDay() <= 31);
    }
    public boolean isValidMonth() {
        return (getMonth() >= 1 && getMonth() <= 12);
    }
    public boolean isValidYear() {
        return (getYear() >= 1900 && getYear() <= 2023);
    }
    public boolean isLength() {
        return date.length() == 10;
    }
    public boolean validDayCount(){
        return getDay()<=31 && getDay()>=1;
    }
    public boolean validMonthCount(){
        return getMonth()<=12 && getMonth()>=1;
    }
    public boolean validYearCount(){
        return getYear()<=2023 && getYear()>=1950;
    }
    public boolean isLeapYear() {
        int year = getYear();
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
    public boolean isDayMonth() {
        if (getMonth() == 2) {
            if (isLeapYear()) {
                return getDay() >= 1 && getDay() <= 29;
            } else {
                return getDay() >= 1 && getDay() <= 28;
            }
        } else if (getMonth() == 4 || getMonth() == 6 || getMonth() == 9 || getMonth() == 11) {
            return getDay() >= 1 && getDay() <= 30;
        } else {
            return getDay() >= 1 && getDay() <= 31;
        }
    }
        public void verifier() {
            if (isLength() && isFirstSlash() && isSecondSlash() && isValidDay() && isValidMonth() && isValidYear() && validDayCount() && validMonthCount() && validYearCount() && isDayMonth()) {
                System.out.println("The format is correct");
            } else {
                System.out.println("The format is wrong");
            }
        }
    public static void main(String[] args) {
        DateFormatVerifier mainObj = new DateFormatVerifier();
        mainObj.input();
        mainObj.verifier();
    }
}