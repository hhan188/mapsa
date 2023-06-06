package Practice11.tamrine8;

import Practice11.tamrine6.SeatAlreadyBookedException;

import java.util.ArrayList;
public class TicketBooking {
            private ArrayList<Integer> tickets;

            public TicketBooking(ArrayList<Integer> tickets) {
                this.tickets = tickets;
            }

            public ArrayList<Integer> getTickets() {
                return tickets;
            }

            public void setSeats(ArrayList<Integer> tickets) {
                this.tickets=tickets;
            }

            public void bookingTicket(int number) throws SeatAlreadyBookedException {
                try{
                    if(!tickets.contains(number)){
                        tickets.add(number);
                        System.out.println("this seat number is now booked seccesfully!");

                    }
                    else{
                        throw new SeatAlreadyBookedException();

                    }
                }catch (SeatAlreadyBookedException e){
                    System.out.println(e.getMessage());
                }
            }
            public void cancellingReservation(Integer number){
                tickets.remove(number);

            }
        }


