package tamrin13;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileOperation {
    static boolean fileImport(Theater theater) {

        System.out.println(Menu.ANSI_BLUE + "\n=== File Import Menu === " + Menu.ANSI_RESET);

        File inputArrangementFile;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the full path include file name of the csv file you want to import");
        System.out.println("(For example: c:\\folder_name\\file_name.csv)");
        System.out.print("Your path: ");

        inputArrangementFile = new File(sc.nextLine().trim());

        //Making console text color RED for printing any error
        System.out.print(Menu.ANSI_RED);

        while (!inputArrangementFile.exists()) {
            System.out.println("\n==> File not exist or wrong path, try again");
            System.out.print("Your path: ");
            inputArrangementFile = new File(sc.nextLine().trim());
        }

        if (!inputArrangementFile.canRead()) {
            System.out.println("==> File can not read, maybe security problem");
            return false;
        }

        String line;
        int rowCount = 1;
        int number;
        int row;
        int column;
        int availability;
        List<Seat> theaterSeatsList = new ArrayList<>();
        theaterSeatsList.add(0, null);

        try (BufferedReader br = new BufferedReader(new FileReader(inputArrangementFile))) {
            while ((line = br.readLine()) != null) {
                String[] lineStringArray = line.split(",");
                try {
                    number = Integer.parseInt(lineStringArray[0]);
                    if (number <= 0) {
                        System.out.println("Error in row:" + rowCount + " ,column 1 must be grater than zero");
                        return false;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error in row:" + rowCount + " ,Invalid number in column 1");
                    return false;
                }
                try {
                    row = Integer.parseInt(lineStringArray[1]);
                    if (row <= 0) {
                        System.out.println("Error in row:" + rowCount + " ,column 2 must be grater than zero");
                        return false;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error in row:" + rowCount + " ,Invalid number in column 2");
                    return false;
                }
                try {
                    column = Integer.parseInt(lineStringArray[2]);
                    if (column <= 0) {
                        System.out.println("Error in row:" + rowCount + " ,column 3 must be grater than zero");
                        return false;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error in row:" + rowCount + " ,Invalid number in column 3");
                    return false;
                }
                try {
                    availability = Integer.parseInt(lineStringArray[3]);
                    if (availability != 0 && availability != 1) {
                        System.out.println("Error in row:" + rowCount + ", column 4 must be just 0 or 1");
                        return false;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error in row:" + rowCount + " ,Invalid number in column 4");
                    return false;
                }

                theaterSeatsList.add(number, new Seat(number, row, column, (availability == 0)));
                rowCount++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Import: FileNotFoundException - Message: " + e.getMessage());
            System.out.println("==> File Import failed");
            return false;
        } catch (IOException e) {
            System.out.println("Import: IOException - Message: " + e.getMessage());
            System.out.println("==> File Import failed");
            return false;
        }

        theater.setSeatList(theaterSeatsList);
        System.out.println(Menu.ANSI_CYAN + "File Import done successfully");
        //Making console text color RESET to continue
        System.out.print(Menu.ANSI_RESET);
        return true;
    }

    static boolean fileExport(Theater theater) {
        System.out.println(Menu.ANSI_BLUE + "\n=== File Export Menu === " + Menu.ANSI_RESET);

        File exportArrangementFile;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the full path include file name of the csv file you want to Export");
        System.out.println("(For example: c:\\folder_name\\file_name.csv)");
        System.out.print("Your path: ");

        exportArrangementFile = new File(sc.nextLine().trim());
        var list = theater.getSeatList();
        String line;
        int number;
        int row;
        int column;
        int availability;

        //Making console text color RED for printing any error
        System.out.print(Menu.ANSI_RED);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(exportArrangementFile))) {
            for (int seat = 1; seat < theater.getTheaterSize(); seat++) {
                //read data from each seat in the list
                number = list.get(seat).getNumber();
                row = list.get(seat).getRow();
                column = list.get(seat).getColumn();
                availability = (list.get(seat).isAvailability() ? 0 : 1);
                //build the output
                line = number + "," + row + "," + column + "," + availability;
                //write data
                bw.write(line, 0, line.length());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Export: IOException - Message: " + e.getMessage());
            System.out.println("==> File Export failed");
            return false;
        }
        
        System.out.println(Menu.ANSI_CYAN + "File Export done successfully");
        //Making console text color RESET to continue
        System.out.print(Menu.ANSI_RESET);
        return true;
    }
}
