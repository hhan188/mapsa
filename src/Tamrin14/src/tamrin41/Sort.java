package tamrin41;

import java.util.*;

public class Sort {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arrays = new Integer[n];
        System.out.println("Enter the elements of the array :");

        for (int i = 0; i < n; i++) {
            arrays[i] = sc.nextInt();
        }
        Arrays.sort(arrays);
        for (int i =n-1; i>=0; i--) {
            LinkedList<Integer> aray = new LinkedList<>(Arrays.asList(arrays[i]));
            Iterator<Integer> It = aray.descendingIterator();
            while (It.hasNext()) {
                System.out.println(It.next());


            }
        }
    }
}

