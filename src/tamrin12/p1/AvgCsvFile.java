package tamrin12.p1;

import java.io.*;

public class AvgCsvFile {
    public static void main(String[] args) {

        String line;
        double sum = 0;
        int count = 0;
        double avg;

        File numFile = new File("src\\tamrin12\\p1","numbers.csv");

        try (BufferedReader br = new BufferedReader(new FileReader(numFile))){
            while ((line = br.readLine()) != null){
                String[] data = line.split(",");
                sum += Double.parseDouble(data[0]);
                count++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException Occurred");
        } catch (IOException e) {
            System.out.println("IOException Occurred");
        }
        avg = sum / count;
        System.out.println("Sum is: " + sum + " & AVG is: " + avg);
    }
}
