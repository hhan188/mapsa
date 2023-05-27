package practices.practice12.exercise1;

import java.io.*;

public class Main {
    //Write a program that reads a CSV file and calculates the average of first column.
    // first column data should be numbed.
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(test());

    }

    public static double test() {
        String path = "E:\\mapsa\\ershadkhah\\mapsa\\src\\practices\\practice12\\exercise1\\read.csv";
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
            throw new RuntimeException(e);
        }

    }
}
