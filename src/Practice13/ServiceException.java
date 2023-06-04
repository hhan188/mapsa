package Practice13;

public class ServiceException extends Exception {

    public void printMessage(String message) {
        System.out.println("message:" + message);
    }
}
