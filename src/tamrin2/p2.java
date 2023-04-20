package tamrin2;

import java.util.Scanner;

public class p2 {

    public static void main(String[] args) {
        System.out.println("* * * * Let's Fuel up! * * * *");
        System.out.println("Enter the amount of distance to calculate the volume of the fuel");
        System.out.println("Type \"quit\" to exit");
        System.out.println("* * * * * * * * * * * * * * * *");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        String input;
        int distance;
        int fuel;

        while (true) {
            System.out.println("Enter the amount of distance: ");
            input = sc.nextLine().trim().toLowerCase();
            if (input.equals("quit"))
                break;
            try {
                distance = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.err.println("Enter valid integer > 0 for distance");
                continue;
            }
			if (distance <= 0){
                System.out.println("Enter valid integer > 0 for n");
                continue;
            }

            fuel = calculateFuel(distance);
            System.out.println("calculateFuel(" + distance +") -> " + fuel);
        }

        }

    private static int calculateFuel(int distance) {
        int fuel = (distance * 10 < 100) ?  100 :  distance*10;
        return fuel;
    }
}
