package practices.practice15.exercise09;

public class Utils {
    protected static int count(Integer integer) {
        double count = 0;
        double result = 0;
        while (true) {
            result = (Math.abs(integer) / Math.pow(10, count++));
            if (result < 10)
                return (int) count;
        }

    }
}
