package Prac9.Generics.P2;

public class Main {
    public static <T extends Comparable<T>> T max(T[] numbers) {
        T max = numbers[0];
        for (int i = 1; i < numbers.length -1; i++) {
            if (max.compareTo(numbers[i]) < 0) {
                max = numbers[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Integer[] integers = {1, 23, 5, 55, 85, 1, -1};
        Double[] doubles = {2.3, 8.4, 99.9, 31.2};
        System.out.println(max(integers));
        System.out.println(max(doubles));
    }
}
