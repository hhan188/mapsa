package practices.practice12;

import java.util.Collection;

public abstract class Manage<T,U extends Number> extends Seat{
    public Manage(Integer availability, Integer row, Boolean available, Collection<T> seats) {
        super(availability, row, available);
        this.seats = seats;
    }

    private Collection<T> seats;

    abstract Collection<T> displaying();

    abstract Collection<T> seatingArrangement();

    abstract Collection<T> reserving(T t);

    abstract Collection<T> cancelingReserving(T t);
    abstract Collection<T> checking(U u1,U u2 );



}
