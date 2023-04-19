package Practice7.TernaryOperator;

public class Three {
    public static void main(String[] args) {
        int a = 10;
        int b = 100;
        int c = 1000;

        int max = a >= b && a >= c ? a : b>=a && b >= c ? b : c;
        System.out.println(max);
    }
}
