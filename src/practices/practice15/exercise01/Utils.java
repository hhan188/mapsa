package practices.practice15.exercise01;

public class Utils {

    protected static Integer[] arrayOfMultipeles(Integer num, Integer length) {
        Integer[] integers = new Integer[length];
        int count = 1;
        for (int i = 0; i < length; i++) {
            integers[i] = num * count++;

        }
        return integers;
    }
}
