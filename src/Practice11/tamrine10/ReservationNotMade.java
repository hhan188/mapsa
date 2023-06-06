package Practice11.tamrine10;

public class ReservationNotMade extends Exception{
    public ReservationNotMade() {
       // inja nemikham biad payami sout kone chon to main null barmigardoone
        //System.out.println("Error!Reservation Hasn't been made!");
    }

    public ReservationNotMade(Throwable cause) {
        super(cause);
    }
    public ReservationNotMade(String message) {
        super(message);//massage ro ham super kon hatman tanull bar nagardoone
    }
}
