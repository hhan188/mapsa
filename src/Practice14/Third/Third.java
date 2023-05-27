package Practice14.Third;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter number");
        while (sc.hasNextInt()){
            System.out.println("Enter number");
            numbers.add(sc.nextInt());

        }
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Element "+ i+" value "+ numbers.get(i));

        }
    }
}
