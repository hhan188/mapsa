package sajjadEmami.Prac5;

public class P9 {
    public static int getGreatestCommonDivisor(int num1, int num2) {
        if (num1 < 10 || num2 < 10)
            return -1;

        int gcd = 1;
        for (int i = 1; i < num1 && i < num2; i++) {
            if (num1 % i == 0 && num2 % i == 0)
                gcd = i;
        }
        return gcd;
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }
}
