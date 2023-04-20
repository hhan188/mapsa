package SoheylSayyah.Practice5;

public class TwentyTwo {
    public static void main(String[] args) {
        int number = 6;
        System.out.println(printFactor(number));
    }

    public static boolean printFactor(int number) {
        int sum = 0;
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
        }
        return sum == number;
    }
}