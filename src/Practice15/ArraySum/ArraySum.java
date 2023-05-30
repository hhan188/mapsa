package Practice15.ArraySum;

import java.util.ArrayList;

public class ArraySum {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        System.out.println(integers);
        System.out.println(arraySum(integers));
        ArrayList<Integer> integers1 = new ArrayList<>();
        integers1.add(1);
        integers1.add(2);
        System.out.println(integers1);
        System.out.println(arraySum(integers1));
        ArrayList<Integer> integers2 = new ArrayList<>();
        integers2.add(1);
        System.out.println(integers2);
        System.out.println(arraySum(integers2));
        ArrayList<Integer> integers3 = new ArrayList<>();
        System.out.println(integers3);
        System.out.println(arraySum(integers3));

    }
    public static int arraySum(ArrayList<Integer> integers){
        int sum=0;
        for (int i = 0; i < integers.size(); i++) {
            sum+=integers.get(i);
        }
        return sum;
    }
}
