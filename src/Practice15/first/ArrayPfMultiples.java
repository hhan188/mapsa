package Practice15.first;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ArrayPfMultiples {
    public static void main(String[] args) {
        array(7,5);
    }

    public static void array(int start,int limit){
        ArrayList<Integer> result=new ArrayList<>();
        int st=start;
        for (int i = 1; i <=limit ; i++) {
            result.add(st*i);
        }
        System.out.println(result);

    }
}
