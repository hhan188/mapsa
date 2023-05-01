package Prac9.Generics.P3;

public class Main {
    public static <T extends Comparable<T>> boolean contains(T[] objects, T target) {
        for (int i = 0; i < objects.length -1; i++) {
            if (target.compareTo(objects[i]) == 0) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String[] strings = {"sajjad", "emami", "test"};
        Integer[] integers = {1, 2, 3, 4, 5, 6};
        System.out.println(contains(strings, "sajjad"));
        System.out.println(contains(integers, 10));
    }
}
