package Practice15.eleventh;

public class PerfectNumber {
    public static void main(String[] args) {
        boolean result = isPerfectNumber(12);
        System.out.println(result);
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;

            }
        }

        return (sum == number);

    }
}
