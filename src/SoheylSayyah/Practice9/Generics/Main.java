package SoheylSayyah.Practice9.Generics;

public class Main {
    public static void main(String[] args) {
        Pair<Integer,String> pair = new Pair<>();
        Integer[] integers = {1,2,3,4,5,6,7,8,9};
        System.out.println(pair.max(integers));
        System.out.println(pair.contain(integers, 2));
        Option<Integer> numbers = new Option<>();
        numbers.present(integers,5);
      //  Collection<Integer> nums = new ArrayList<>();
        Integer[] nums = {11,22,33,44,55,66,77,88,99};

    }
}
