package Practice13;

import java.util.Arrays;
import java.util.Scanner;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class importExportFile {
    public static void importCSV(String content, String filePath) throws IOException {
        File csvFile = new File(filePath);
        FileWriter fileWriter = new FileWriter(csvFile);
        fileWriter.write(content);
        fileWriter.close();

    }

    public void exportCSV() {
        String fileName = "/home/ershadbakhsh/Desktop/hanieh.csv";
        Scanner sc = new Scanner(fileName);
        sc.useDelimiter(",");
        while (sc.hasNext()) {
            System.out.print(sc.next());
        }
        sc.close();
    }
}
