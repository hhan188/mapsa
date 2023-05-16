package Prac13.classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class FileExporter {
    private <T extends Collection<Seat>> String createFileContent(T seats) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Seat seat : seats) {
            stringBuilder
                    .append(seat.getSeatRow())
                    .append(",")
                    .append(seat.getSeatNumber())
                    .append(",")
                    .append(seat.isAvalability())
                    .append("\n");
        }
        return stringBuilder.toString();
    }

    public <T extends Collection<Seat>> void saveCsvFile(String filePath, T seats) {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/Prac13/exports/" + filePath + ".csv"))) {
            String fileContent = createFileContent(seats);
            bufferedWriter.write(fileContent);
            System.out.println("csv file with name " + filePath + " succesfully created!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
