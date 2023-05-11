package Prac12.P1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String[]> rows = extractRows("src/Prac12/P1/numbers.csv");
        int[] numbers = extractNumberFromRow(rows);
        System.out.println(calcAverage(numbers));
    }

    public static ArrayList<String[]> extractRows(String filePath) {
        ArrayList<String[]> rows = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                rows.add(row);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return rows;
    }

    public static int[] extractNumberFromRow(ArrayList<String[]> rows) {
        rows.remove(0); //Remove headers
        int[] numbers = new int[rows.size()];
        for (int i = 0; i < rows.size(); i++) {
            try {
                numbers[i] = Integer.parseInt(rows.get(i)[0]);
            } catch (NumberFormatException e) {
                System.err.println("not a valid number");
            }
        }
        return numbers;
    }

    public static double calcAverage(int[] numbers) {
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }
}
