package Prac5;

public class P14 {
    public static boolean isPrime(int num) {
        for (int i = 2; i < num-1; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static int getLargestPrime(int num) {
        if (num <= 1)
            return -1;

        int largestPrime = 0;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0 && isPrime(i) && i > largestPrime)
                largestPrime = i;
        }

        return largestPrime;
    }

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }
}
