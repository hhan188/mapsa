package Prac14.P41;

import java.util.*;

public class Main {
    public static List<Integer> getIntegers(int arraySize) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> ints = new ArrayList<>(arraySize);
        for (int i = 0; i < arraySize; i++) {
            System.out.println("please enter value for index " + i);
            if (scanner.hasNextInt()) {
                ints.add(scanner.nextInt());
            } else {
                System.err.println("please enter an valid integer");
            }
        }
        return ints;
    }

    public static <T extends List<Integer>> T sortIntegers(T intsList) {
        Comparator<Integer> decOrder = (Integer num1, Integer num2) -> num2 - num1;
        intsList.sort(decOrder);
        return intsList;
    }

    public static <T> void printArray(List<T> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("element " + i + "contents " + list.get(i));
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter size of numbers");
        int size = scanner.nextInt();
        List<Integer> unsortedInts = getIntegers(size);
        List<Integer> sortedInts = sortIntegers(unsortedInts);
        printArray(sortedInts);
    }
}
