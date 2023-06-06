package practice15.five;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SumArray {

    public static void sumArr(ArrayList<Integer> arrayList){
        int temp=0;
        for (int i = 1; i < arrayList.size(); i++) {
            temp+=arrayList.get(i);
        }
        System.out.println(arrayList);

    }
}
