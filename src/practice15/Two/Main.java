package practice15.Two;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(5);
        War war=new War();
        war.warOfNumber(arrayList);

    }

}
