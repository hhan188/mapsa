package practice14.ReadInteger;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Lambda {
    public static void main(String[] args) {
        Supplier<List<Integer>> supplier=()->{
            List<Integer> list=new ArrayList<>();
            for (int i = 0; i < 101; i++) {
                list.add(i);
            }
            return list;
        };
        List<Integer> myLIst=supplier.get();




    }
}
