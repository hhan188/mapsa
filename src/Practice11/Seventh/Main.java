package Practice11.Seventh;

public class Main {
    public static void main(String[] args) {
        Flight flight = new Flight();
        flight.setBook(true);
        try {
            flight.booking();

        }catch (SeatAlreadyBookedException e){
            System.out.println(e.getMessage());
        }
    }
}
