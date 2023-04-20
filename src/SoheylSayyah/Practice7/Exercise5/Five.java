package SoheylSayyah.Practice7.Exercise5;

public class Five {
    public static void main(String[] args) {
        double[] array = {1.5,2.5,3.5,4.5,5.5,6.5};
        double sum = 0;
        for (int i = 0 ; i < array.length ; i++){
            sum += array[i];
        }
        double average = sum / array.length;
        System.out.println(average);
    }
}