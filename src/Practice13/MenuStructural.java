package Practice13;

import Practice13.Exceptions.NotReservedYetException;
import Practice13.Exceptions.SeatAlreadyBookedException;
import Practice13.Exceptions.SeatIsNotFindException;

import java.util.Scanner;

public class MenuStructural {

    public static void main(String[] args) throws SeatAlreadyBookedException, SeatIsNotFindException, NotReservedYetException {
        System.out.println("Welcome to the french Theaters");
        System.out.println("Press 1 to Create a new Theater");
        System.out.println("Press 2 for Use from File");
        Scanner sc = new Scanner(System.in);
        String control = sc.next();
        boolean isMade=false;

        while (!control.equalsIgnoreCase("exit")){
           switch (control){
               case "1":
                   System.out.println("Enter Theater name");
                   String theaterName=sc.next();

                   System.out.println("Enter Theater Rows");
                   int theaterRow=sc.nextInt();
                   ;
                   System.out.println("Enter Theater Columns");
                   int theaterColumns=sc.nextInt();

                   Theater theater=new Theater(theaterName,theaterColumns,theaterRow);
                   isMade=true;
                   System.out.println("*********************************************");

                   while (isMade){
                       System.out.println("Press 1 for display whole the hall ");
                       System.out.println("Press 2 for reserve a seat");
                       System.out.println("Press 3 for Cancel a Seat");
                       System.out.println("Press 4 for checking The Seat Status");
                       System.out.println("Press 5 for Export to file");
                       String control2=sc.next();
                       switch (control2){
                           case "1":
                               System.out.println(theaterName);
                               for (Seat seat:theater.seats) {
                                   System.out.println("Seat width Number "+seat.getSeatNumber()+" is "+(seat.isAvailabilityStatus()?"Avilable":"Reserved"));
                               }
                               break;
                           case "2":
                               System.out.println("Enter Seat number");
                               int seatNumberForReserve=sc.nextInt();
                               theater.reserving(seatNumberForReserve);
                               break;
                           case "3":
                               System.out.println("Enter Seat Number");
                               int seatNumberForCancel=sc.nextInt();
                               theater.canceling(seatNumberForCancel);
                               break;
                           case"4":
                               System.out.println("Enter seat number");
                               int seatNumberForCheckAvailability=sc.nextInt();
                               theater.availability(seatNumberForCheckAvailability);
                               break;
                           case "5":
                               Theater.fileExporter();
                               System.out.println("Theater is make");
                               break;
                       }


                   }
               case "2":
                   Theater.fileImporter();
                   break;

           }
        }
    }


}
