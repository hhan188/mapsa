package SoheylSayyah.Practice7.Exercise6;

public class Six {
    public static void main(String[] args) {
        double[] numbers = new double[12];
        double min = 0;
        numbers[0] = 116;
        numbers[1] = 231;
        numbers[2] = 334;
        numbers[3] = 416;
        numbers[4] = 5532;
        numbers[5] = 6251;
        numbers[6] = 7221;
        numbers[7] = 15;
        numbers[8] = 92;
        numbers[9] = 10;
        numbers[10] = 90;
        numbers[11] = 53;
        for (double item : numbers){
            if (item < numbers.length){
                min = item;
            }
        }
        System.out.println(min);
    }
}
