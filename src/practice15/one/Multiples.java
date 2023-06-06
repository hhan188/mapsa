package practice15.one;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Multiples {
    public void multiPles(int num,int length){
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i = 1; i <=length ; i++) {
            arrayList.add(i*num);
        }
        System.out.println(arrayList);
    }
}
