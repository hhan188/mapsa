package tamrin7.p5;
//Problem 5
public class Main {
    public static void main(String[] args) {

        double[] sixDoubles = {1.5, 10.55, 11.25, 32.7, 61.6, 23.23};
        double sum = 0;
        double average;
        for (double element : sixDoubles) {
            sum += element;
        }
        average = sum / sixDoubles.length;
        System.out.println("average is: " + average);
        
    }
}

