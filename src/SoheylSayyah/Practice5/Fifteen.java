package SoheylSayyah.Practice5;

public class Fifteen {
    public static void main(String[] args) {
        int number = -1221;
        System.out.println(isPalindrome(number));
    }
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int originalNumber = number;
        while (number != 0){
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }return originalNumber == reverse;
    }
}
