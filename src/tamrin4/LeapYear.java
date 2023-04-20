package tamrin4;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("isLeapYear(-1600) -> " + isLeapYear(-1600));
        System.out.println("isLeapYear(1600) -> " + isLeapYear(1600));
        System.out.println("isLeapYear(2017) -> " + isLeapYear(2017));
        System.out.println("isLeapYear(2000) -> " + isLeapYear(2000));
    }

    public static boolean isLeapYear(int year) {
        if (year < 0 || year > 9999)
            return false;
        if (year % 4 != 0)
            return false;
        if (year % 100 != 0)
            return true;
        if (year % 400 != 0)
            return false;
        else
            return true;
    }
}
