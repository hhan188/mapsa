package Practice11.tamrine6;

import java.util.ArrayList;
public class Flight  {
    private ArrayList<Integer> seats;

    public Flight(ArrayList<Integer> seats) {
        this.seats = seats;
    }

    public ArrayList<Integer> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<Integer> seats) {
        this.seats=seats;
    }

    public void bookingSeat(int number) throws SeatAlreadyBookedException{
        try{
            if(!seats.contains(number)){
                seats.add(number);
                           System.out.println("this seat number is now booked seccesfully!");

            }
            else{
                throw new SeatAlreadyBookedException();

            }
        }catch (SeatAlreadyBookedException e){
            System.out.println(e.getMessage());
        }
    }
    public void cancellingBooking(Integer number){
        seats.remove(number);

    }
}
