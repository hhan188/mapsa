package Prac13.classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileImporter {
    private int newRowCount;
    private int newColCount;
    /**
     * read and extract rows from an csv file
     * @param filePath path to the csv file
     * @return an array list of string arrays that represent csv file rows
     */
    private ArrayList<String[]> extractCsvRows(String filePath) {
        ArrayList<String[]> rows = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader("src/Prac13/imports/" + filePath + ".csv"))) {
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

    /**
     * extract data from csv rows, create and return an ArrayList of Seats
     * @param filePath path to csv file
     * @return ArrayList of Seat objects
     */
    public ArrayList<Seat> extractSeatsFromCsv(String filePath) {
        ArrayList<String[]> rows = extractCsvRows(filePath);
        ArrayList<Seat> seats = new ArrayList<>();
        int newRowCount = 0;
        int seatCount = 0;
        for (String[] row : rows) {
            seatCount++;
            int rowNumber  = Integer.parseInt(row[0]);
            int seatNumber = Integer.parseInt(row[1]);
            if (rowNumber > newRowCount) {
                newRowCount = rowNumber;
            }
            boolean availability = row[2].equals("true");
            seats.add(new Seat(seatNumber, rowNumber, availability));
        }
        this.newRowCount = newRowCount;
        this.newColCount = seatCount / newRowCount;
        return seats;
    }
    public int getNewRowCount() {
        return newRowCount;
    }

    public int getNewColCount() {
        return newColCount;
    }
}
