package sajjadEmami.Prac5;

public class P3 {
    public static boolean isOdd(int num) {
        if (num < 0)
            return false;

        return num % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        if (start < 0 || end < 0)
            return -1;

        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i))
                sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
    }
}
