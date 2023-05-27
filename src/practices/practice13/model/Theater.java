package practices.practice13.model;

import java.util.List;

public class Theater extends Seat {
    private String name;
    private List<Seat> seatList;

    public Theater() {
    }


    public Theater(String name, List<Seat> seatList) {
        this.name = name;
        this.seatList = seatList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList(List<Seat> seatList) {
        this.seatList = seatList;
    }

}
