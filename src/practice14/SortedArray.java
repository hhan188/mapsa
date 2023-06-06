package practice14;

import java.util.*;

public class SortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = 0;
        System.out.println("enter array size :");
        size = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>(size);

        for (int i = 0; i < size; i++) {
            System.out.println("Enter Numbers :");
            if (sc.nextInt()==0){
                break;
            }else list.add(sc.nextInt());
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        SortedArray sortedArray=new SortedArray();
        sortedArray.getIntegers(list);

    }
    public void getIntegers(ArrayList ls){
        System.out.println("After Sorted :"+ls);
    };


}









