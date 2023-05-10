package SoheylSayyah.Practice11.Exercise6;

public class Main {
    public static void main(String[] args) {

        try {
            Flight flight = new Flight(true);
            flight.booking();
        }
        catch (SeatAlreadyBookedException e){
            System.err.println(e.getMessage());
        }
    }
}
