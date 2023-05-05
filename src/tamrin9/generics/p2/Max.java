package tamrin9.generics.p2;

public class Max {

    public static <T extends Comparable<T>> T max(T[] array) {
        if (array.length == 0)
            return null;

        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max.compareTo(array[i]) < 0)
                max = array[i];
        }
        return max;
    }
}
