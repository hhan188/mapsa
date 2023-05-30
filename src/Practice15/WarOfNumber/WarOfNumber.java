package Practice15.WarOfNumber;

import java.util.ArrayList;

public class WarOfNumber {
    public static void main(String[] args)
    {

        ArrayList<Integer>arrayList = new ArrayList<>();
        arrayList.add(12);
        arrayList.add(90);
        arrayList.add(75);
        warOfNumber(arrayList);
        System.out.println(arrayList);

    }
    public static void warOfNumber(ArrayList<Integer> arrayList){
        int sumEven=0;
        int sumOdd=0;
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i)%2==0){
                even.add(arrayList.get(i));
            } else if (arrayList.get(i)%2 !=0) {
                odd.add(arrayList.get(i));
            }
        }
        for (int i = 0; i < even.size(); i++) {
            sumEven+=even.get(i);
        }
        for (int i = 0; i < odd.size(); i++) {
            sumOdd+=odd.get(i);
        }
        if (sumOdd-sumEven>0){
            System.out.println("odd number is win" +" with "+(sumOdd-sumEven)+" difference");
        }else if (sumOdd-sumEven==0) {
            System.out.println("both is equal");
        } else System.out.println("Even number is win"+" with "+(sumEven-sumOdd)+" difference");
    }
}
