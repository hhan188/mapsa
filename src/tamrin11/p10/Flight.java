package tamrin11.p10;

public class Flight {
    private String flightID;
    private short totalSeatNumber;

    public Flight(String flightID, short totalSeatNumber) {
        this.flightID = flightID;
        this.totalSeatNumber = totalSeatNumber;
    }

    public String getFlightID() {
        return flightID;
    }

    public short getTotalSeatNumber() {
        return totalSeatNumber;
    }
}
