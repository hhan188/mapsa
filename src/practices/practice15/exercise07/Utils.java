package practices.practice15.exercise07;

public class Utils {

    protected static int operation(String num1, String num2, Operation operation) {
        try {
            switch (operation) {
                case add:
                    return Integer.parseInt(num1) + Integer.parseInt(num2);
                case subtract:
                    return Integer.parseInt(num1) - Integer.parseInt(num2);
                case divide:
                    return Integer.parseInt(num1) / Integer.parseInt(num2);
                default:
                    return -1;
            }
        } catch (ArithmeticException|NumberFormatException e) {
            return Integer.MIN_VALUE;
        }
    }
}
