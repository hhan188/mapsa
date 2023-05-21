package Practice7.Five;

public class Avg {
    public static void main(String[] args) {
        double[] doubles ={1.6,45,7.8,23,98,32};
        double sum = 0;
        for (int i = 0; i < doubles.length; i++) {
            sum+=doubles[i];
        }
        double avg = sum/ doubles.length;
        System.out.println(avg);

    }
}
