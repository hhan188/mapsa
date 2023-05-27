package practices.practice15.exercise16;

import java.util.Arrays;

import static practices.practice15.exercise16.Utils.recorderDigit;

public class Main {
    public static void main(String[] args) {
        Integer[] integers={515,341,44,211};
        Integer[] integers1={63251,78221};
        Integer[] integers2={1,2,3,4};


        System.out.println(Arrays.toString(recorderDigit(integers, Order.Asc)));
        System.out.println(Arrays.toString(recorderDigit(integers, Order.Desc)));
        System.out.println(Arrays.toString(recorderDigit(integers1, Order.Asc)));
        System.out.println(Arrays.toString(recorderDigit(integers1, Order.Desc)));
        System.out.println(Arrays.toString(recorderDigit(integers2, Order.Asc)));
        System.out.println(Arrays.toString(recorderDigit(integers2, Order.Desc)));


    }

}
