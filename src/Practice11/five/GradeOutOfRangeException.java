package Practice11.five;

public class GradeOutOfRangeException extends Exception{
    public GradeOutOfRangeException(String message) {
        super(message);
    }

    public GradeOutOfRangeException() {
        super();
    }
}
