package SoheylSayyah.Practice5;

public class Fourteen {
    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        if (isOdd(start)) {
            System.out.println(sumOdd(start, end));
        } else {
            System.out.println(-1);
        }
    }

    public static boolean isOdd(int number) {
        return number < 0 && number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        if (start > 0 && end > 0 && end > start) {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum = sum + i;
                } else {
                    return -1;
                }
            }
        }
        return sumOdd(start,end);
    }
}