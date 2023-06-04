package Practice13;

import java.io.IOException;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) throws SeatIsAlreadyReservedException, SeatNotFoundException, SeatNotReservedYetException, IOException {
            UserInteraction userInteraction = new UserInteraction();
            Scanner scanner = new Scanner(System.in);
            boolean resume = true;
            while (resume){
                System.out.println("*- Welcome To The Theater Program -*");
                System.out.println("------------------------------------");
                System.out.println("Enter 1 For Creating a New Theater");
                System.out.println("Enter 2 For Importing a Theater From a File");
                System.out.println("Enter 0 For Exiting The Program");
                System.out.println("-------------------------------------------");
                int controlPanel = scanner.nextInt();
                switch (controlPanel){
                    case 1:
                        userInteraction.makeTheater();
                        break;
                    case 2:

                        break;
                    case 0:
                        resume = false;
                        break;
                }
            }
        }
}
