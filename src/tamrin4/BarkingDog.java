package tamrin4;

public class BarkingDog {
    public static void main(String[] args) {
        System.out.println("shouldWakeUp (true, 1) -> " + shouldWakeUp(true, 1));
        System.out.println("shouldWakeUp (false, 2) -> " + shouldWakeUp(false, 2));
        System.out.println("shouldWakeUp (true, 8) -> " + shouldWakeUp(true, 8));
        System.out.println("shouldWakeUp (true, -1) -> " + shouldWakeUp(true, -1));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23)
            return false;
        if (barking && (hourOfDay < 8 || hourOfDay > 22))
            return true;
        else
            return false;
    }
}