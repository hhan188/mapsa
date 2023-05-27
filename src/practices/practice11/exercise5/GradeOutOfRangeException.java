package practices.practice11.exercise5;

import java.io.IOException;

public class GradeOutOfRangeException extends IOException {

    public String getException(Exception e) {

            return "this grade is out of range";

    }
}
