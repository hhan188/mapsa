package practices.practice11.exercise121;

import java.io.*;

public class Main {

    //Write a program that reads a list of numbers from a file and calculates their average using a try-with-resources block.
    // Use a BufferedReader to read the contents of the file and a Scanner to parse the numbers.
    public static void main(String[] args) {
        System.out.println(bfReaderToAverage());
    }


    protected static double bfReaderToAverage() {
        String path = "E:\\mapsa\\ershadkhah\\mapsa\\src\\practices\\practice11\\exercise121\\average.csv";
        File file = new File(path);
        double sum = 0;
        int count = 0;
        try (Reader reader = new FileReader(file)) {
            BufferedReader bf = new BufferedReader(reader);

            while (bf.ready()) {
                sum += Double.parseDouble(bf.readLine());
                count++;
            }
            System.out.println(sum);
            System.out.println(count);
            return sum / count;
        } catch (IOException e) {
            System.out.println("File Is Not Found");
        }
        return -1;
    }
}
