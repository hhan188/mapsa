package tamrin9.generics.p3;

public class Contains {

    public static <T> boolean contains(T[] array, T target){

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target))
                return true;
        }
        return false;
    }
}
