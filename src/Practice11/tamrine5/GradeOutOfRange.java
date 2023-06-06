package Practice11.tamrine5;

public class GradeOutOfRange extends Exception{
    public GradeOutOfRange() {
    }

    public GradeOutOfRange(String message) {
        super(message);
    }

    public GradeOutOfRange(Throwable cause) {
        super(cause);
    }
}

