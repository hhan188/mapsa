package tamrin16.p6;

import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Integer> test = List.of(10,20,30,40,50,60,70,80,90);
        IncrementListTransformer ilt = new IncrementListTransformer();
        List<Integer> transformedArray = ilt.transform(test);
        System.out.println(transformedArray);
    }
}
