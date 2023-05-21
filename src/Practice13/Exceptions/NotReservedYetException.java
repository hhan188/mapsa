package Practice13.Exceptions;

public class NotReservedYetException extends Exception{
    public NotReservedYetException() {
        this("This Is Not Reserved Yet");
    }

    public NotReservedYetException(String message) {
        super(message);
    }
}
