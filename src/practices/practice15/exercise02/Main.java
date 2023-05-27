package practices.practice15.exercise02;

import static practices.practice15.exercise02.Utils.warOfNumbers;

public class Main {
    public static void main(String[] args) {

        Integer[] integers = {2, 8, 7, 5};
        System.out.println((warOfNumbers(integers) >= 0 ? "Evens Win The Battle: " : "Odds Win The Battle: ") + Math.abs(warOfNumbers(integers)));
        Integer[] integers1 = {12, 90, 75};
        System.out.println((warOfNumbers(integers1) >= 0 ? "Evens Win The Battle: " : "Odds Win The Battle: ") + Math.abs(warOfNumbers(integers1)));
        Integer[] integers2 = {5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243};
        System.out.println((warOfNumbers(integers2) >= 0 ? "Evens Win The Battle: " : "Odds Win The Battle: " )+ Math.abs(warOfNumbers(integers2)));

    }
}
