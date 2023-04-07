package sajjadEmami.Prac5;

public class P10 {
    public static void printFactors(int num) {
        if (num < 1)
            System.out.println("Invalid value");

        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                System.out.println(i);
        }
        System.out.println("************");
    }

    public static void main(String[] args) {
        printFactors(10);
        printFactors(6);
        printFactors(32);
        printFactors(-1);
    }
}
