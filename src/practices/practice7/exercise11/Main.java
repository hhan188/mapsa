package practices.practice7.exercise11;

public class Main {
    public static void main(String[] args) {
        int searchNumber = 10;
        int[] array = {4, 0, 3, 7, 71, 1, 6, 10, 11, 12, 10, 25, 12, 13, 14, 15, 17, 10, 12, 13, 19};
        System.out.println(FindNumber.finNumber(searchNumber, array));
        System.out.println("***********************");
        searchNumber = 500;
        System.out.println(FindNumber.finNumber(searchNumber, array));
    }
}
