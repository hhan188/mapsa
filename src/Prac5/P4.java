package sajjadEmami.Prac5;

public class P4 {
    public static boolean isPalindrome(int num) {
        int rem, sum = 0;
        int temp = num;

        while (num > 0) {
            rem = num % 10;
            sum = (sum * 10) + rem;
            num = num / 10;
        }

        return sum == temp;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(171));
        System.out.println(isPalindrome(2928));
    }
}
