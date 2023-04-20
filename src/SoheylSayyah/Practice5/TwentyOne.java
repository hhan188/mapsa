package SoheylSayyah.Practice5;

public class TwentyOne {
    public static void main(String[] args) {
        int number = 6;
        printFactor(number);
    }
    public static int printFactor(int number) {
        int i = 1;
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            for (i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }
        return i;
    }
}
