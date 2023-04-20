package SoheylSayyah.Practice7.Exercise9;

public class Nine {
    public static void main(String[] args) {
        double[] array1 = {1,2,3,4,5,6,7};
        double[] array2 = {8,9,10,11,12,13,14};
        double[] multiply = new double[7];
        for (int i = 0; i < 7; i++) {
            multiply[i] = array1[i] * array2[i];
        }
        for (int i = 0; i < 7; i++) {
            System.out.println(multiply[i]);
        }
    }
}
