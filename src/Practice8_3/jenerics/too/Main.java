package Practice8_3.jenerics.too;

public class Main {
    public static void main(String[] args) {
        Option<Integer> option=new Option<>();

        Integer[] ints={5,6,7};
        System.out.println(option.PresenceOrAbsence(ints, 6));


    }
}
