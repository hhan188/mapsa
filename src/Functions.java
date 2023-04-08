public class Functions {
    public int convert(int minutes) {
        int sec = minutes * 60;
        System.out.println("sec: " + sec);
        return sec;
    }

    public int SumOfTwoNumbers(int a, int b) {
        int sum = a + b;
        System.out.println("sum: " + sum);
        return sum;
    }

    public int addition(int a) {
        a = a + 1;//==a++
        int b = a + 1;

        return b;
    }

    public Boolean isSameNum(int a, int b) {
        if (a == b) {
            System.out.println("true");
            return true;


        } else {
            System.out.println("false");
            return false;
        }

    }

    public void howManySeconds(double hours) {
        double minutes, seconds;


        minutes = hours * 60;
        seconds = hours * 3600;

        System.out.printf("There are %f minutes in %f hours", minutes, hours);
        System.out.printf("\nThere are %f seconds in %f hours", seconds, hours);
    }

    public float findPerimeter(float length, float width) {
        return 2 * length + 2 * width;
    }

    public long power(long voltage, long current) {
        long pow = voltage * current;
        return pow;
    }

    public int nextEdge(int s1, int s2) {
        if (s1 <= 0 || s2 <= 0) {
            System.out.print(-1);
            return -1;
        }
        int max_length = s1 + s2 - 1;
        return max_length;
    }

    public int triArea(int base, int height) {
        return ((base * height) / 2);

    }


}
