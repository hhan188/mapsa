package Practice9.Generics.Three;

import java.util.ArrayList;

public class Contain{
    public static void main(String[] args) {
        String[] name = {"Jack", "Daniel"};
        Integer[] number = {1,2,3,4,5,6};
        System.out.println(contains(name, "Jack"));
        System.out.println(contains(number, 3));

    }
    public static <T> boolean contains(T[] array, T target){
        for (T t : array)
            if (t.equals(target))
                return true;
        return false;
    }
}
