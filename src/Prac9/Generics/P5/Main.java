package Prac9.Generics.P5;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static <T extends Object, U extends Collection<T>> U map(U collection) {
        Collection<Object> newCollection = new ArrayList<>();
        Object[] valuesArray = collection.toArray();
        for (int i = 0; i < valuesArray.length; i++) {
            valuesArray[i] = "salam!";
            newCollection.add(valuesArray[i]);
        }
        return (U) newCollection;
    }

    public static void main(String[] args) {
        Collection<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(100);

        System.out.println(map(integers));
    }
}
