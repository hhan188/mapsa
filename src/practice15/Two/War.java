package practice15.Two;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class War {
    ArrayList<Integer> arr=new ArrayList<>();



    public void warOfNumber(ArrayList<Integer> arr ){
        this.arr=arr;
        ArrayList<Integer> odd=new ArrayList<>();
        ArrayList<Integer> even=new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i)%2==0){
                even.add(arr.get(i));

            }
            System.out.println(arr);
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i)%2!=0){
                odd.add(arr.get(i));

            }
        }
        int evenTemp=0;
        for (int i = 0; i < even.size(); i++) {
            evenTemp+=even.get(i);
            System.out.println(even);
        }
        int oddTemp=0;
        for (int i = 0; i < odd.size(); i++) {
            oddTemp+=odd.get(i);
            System.out.println(odd);

        }
        if (oddTemp<evenTemp){
            System.out.println("odd larger than even");
        }else System.out.println("even larger than odd");
    }
}
