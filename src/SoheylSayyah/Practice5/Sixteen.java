package SoheylSayyah.Practice5;
public class Sixteen {
    public static void main(String[] args) {
        int number = 5;
        System.out.println(sumFirstAndLastDigits(number));
    }

    public static int sumFirstAndLastDigits(int number) {
        if (number < 0) {
            return -1;
        } else {
            int lastDigit = number % 10;
            while (number >= 10){
                number = number / 10;
            }
            return number + lastDigit;
        }
    }
}