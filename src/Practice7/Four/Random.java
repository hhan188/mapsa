package Practice7.Four;

public class Random {
    public static void main(String[] args) {
        int[] randoms = new int[100];
        for (int i = 0; i < randoms.length; i++) {
            randoms[i] = (int) (Math.random() * 10);
            System.out.println(randoms[i]);
        }

    }
}
