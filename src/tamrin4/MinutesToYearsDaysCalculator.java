package tamrin4;

public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }
    public static void printYearsAndDays (long minutes){
        if (minutes<0)
            System.out.println("Invalid Value");
        long year = minutes / (365*24*60);
        long day = minutes % (365*24*60) / (24*60);
        System.out.println(minutes + " min = " + year + " y and " + day + " d");
    }
}
