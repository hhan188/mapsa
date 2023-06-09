package Practice12;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;

public class CSVReader {
    public static void main(String[] args) throws IOException {
        File csvFile = new File("/Users/mersedeh/Desktop/numbers.csv");
        String line = "";
        String cvsSplitBy = ",";
        int sum = 0;
        int counter=0;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine();
            while ((line = br.readLine()) != null) {

                String[] numbers = line.split(",");
                Double number=Double.parseDouble(numbers[0]);
                sum += number;
                counter++;

            }
            System.out.println("Average: " + (sum/counter) );

        } catch (IOException e) {
            System.out.println("File does not exist");
            e.printStackTrace();
        }


    }

}