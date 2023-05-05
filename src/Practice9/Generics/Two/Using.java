package Practice9.Generics.Two;

public class Using {
    public static void main(String[] args) {
        Max<Integer> max = new Max();
        System.out.println(max.max(new Integer[]{2, 3, 4, 10, 6, 7, 8, 9}));
    }
}
