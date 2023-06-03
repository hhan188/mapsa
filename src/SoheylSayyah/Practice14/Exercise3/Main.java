package SoheylSayyah.Practice14.Exercise3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Please Enter Your Number :");
        while (scanner.hasNextInt()) {
            System.out.println("Please Enter Your Number :");
            numbers.add(scanner.nextInt());
        }
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Element " + i + " Contents " + numbers.get(i));
        }
    }
}
