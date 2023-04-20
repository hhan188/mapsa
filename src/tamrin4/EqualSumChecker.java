package tamrin4;

public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println("hasEqualSum(1, 1, 1) -> " + hasEqualSum(1, 1, 1));
        System.out.println("hasEqualSum(1, 1, 2) -> " + hasEqualSum(1, 1, 2));
        System.out.println("hasEqualSum(1, -1, 0) -> "+ hasEqualSum(1, -1, 0));
    }

    public static boolean hasEqualSum(int a, int b, int c) {
        if (a + b == c)
            return true;
        else
            return false;
    }
}
