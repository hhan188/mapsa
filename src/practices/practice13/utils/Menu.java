package practices.practice13.utils;

import practices.practice13.controller.CustomIOException;
import practices.practice13.controller.CustomInputMismatchException;
import practices.practice13.file.BaseFile;
import practices.practice13.file.ExportFile;
import practices.practice13.file.ImportFile;
import practices.practice13.model.Theater;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Menu {
    TheaterUtils theaterUtils = new TheaterUtils();


       /*-------------------------------------------------------------------
         The Menu For Theater Actions Such Az Reserve,Cancel,And Print File
         -------------------------------------------------------------------*/

    public void menu() throws CustomIOException, CustomInputMismatchException {
        Theater theater = createTheater();
        if (theater != null) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\t\t   -------------------------------------\n" +
                    "\t\t\t****\"WELCOME TO '" + theater.getName() + "' THEATER\"**** \n" +
                    "\t\t   -------------------------------------");
            while (true) {
                System.out.println(
                        "\n\t\t\t\t    *PLEASE PRESS A BUTTON* \n" +
                                "\n1:Show All Seats \n" +
                                "2:Reserve A Seat  \n" +
                                "3:Cancel Reservation  \n" +
                                "4:PRINT  \n" +
                                "5:Show Available Seats From Export's File \n" +
                                "6:EXIT ");
                String a = sc.next();
                switch (String.valueOf(a)) {
                    case "1": {
                        System.out.println(theaterUtils.availableSeat());
                        break;
                    }
                    case "2": {

                        System.out.print("Enter The Number Of Your Demand Seat:");
                        Scanner scanner = new Scanner(System.in);
                        Integer seatNumber = scanner.nextInt();
                        System.out.println(theaterUtils.showReserveSeat(seatNumber));
                        break;
                    }
                    case "3": {
                        System.out.print("Enter The Number Of Your Reserved Seat fo Cancelation:");
                        Scanner scanner = new Scanner(System.in);
                        Integer seatNumber = scanner.nextInt();
                        System.out.println(theaterUtils.showCancelSeat(seatNumber));
                        break;
                    }
                    case "4": {
                        BaseFile<TheaterUtils> exportFile = new ExportFile();
                        exportFile.fileUtil(theaterUtils);
                        break;

                    }
                    case "5": {
                        BaseFile<TheaterUtils> importFile = new ImportFile();
                        importFile.fileUtil(theaterUtils);
                        break;
                    }
                    case "6": {
                        return;
                    }
                    default:
                        System.out.println("\n\t\t\"ERROR\"Please Enter A Valid Number From '1' To '6'");
                }
            }
        }
    }


    /*--------------------------
      Theater Created From CLI
     ---------------------------*/

    public Theater createTheater() throws CustomInputMismatchException {
        try {

            System.out.println("\t\t   -------------------------------------\n" +
                    "\t\t\t****\"Please Create Your Favorite Theater\"**** \n" +
                    "\t\t   -------------------------------------");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please Enter Your Favorite Name For Theater: ");
            String name = scanner.next();
            System.out.print("Please Enter The Number Of Raw: ");
            Integer raw = scanner.nextInt();
            System.out.print("Please Enter The Number Of Column: ");
            Integer column = scanner.nextInt();

            return theaterUtils.createTheater(name.toUpperCase(), raw, column);
        } catch (InputMismatchException e) {
            throw new CustomInputMismatchException("Please Enter Digit Numbers");
        }
    }
}




