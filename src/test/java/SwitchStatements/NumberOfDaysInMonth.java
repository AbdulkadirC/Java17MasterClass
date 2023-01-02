package SwitchStatements;

public class NumberOfDaysInMonth {

    public static void main(String[] args) {

        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(1700));
        System.out.println(isLeapYear(2000));

        System.out.println("******************");

        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));

    }

    public static boolean isLeapYear(int year){

        if (year <= 1 || year >= 9999){
            return false;
        }else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            return true;
        }
        return false;
    }

    public static int getDaysInMonth (int month, int year){

        int numberOfMonth = switch (month){
            case 2 -> 28;
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };

        if ((month < 1 || month > 12) || (year < 1 || year > 9999)){
            return -1;
        }else if (isLeapYear(year) == true && month == 2) {
            //numberOfMonth = 29;
            return 29;
        }
        return numberOfMonth;
    }
}