package Practice11.Seventh;

public class Flight {
    private boolean isBook;

    public Flight(boolean isBook) {
        this.isBook = isBook;
    }

    public Flight() {
    }

    public boolean isBook() {
        return isBook;
    }

    public void setBook(boolean book) {
        isBook = book;
    }

    public void booking() throws SeatAlreadyBookedException {
       if (isBook){
           throw new SeatAlreadyBookedException("Seat is Already booked");
       }

    }
    public boolean canceling(){
        return isBook = false;
    }
}
