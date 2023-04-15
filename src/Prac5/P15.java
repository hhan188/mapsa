package Prac5;

public class P15 {
    public static void printSquareStar(int num) {
        if (num < 5) {
            System.out.println("Invalid Value");
            return;
        }
        int i, j;
        for (i = 1; i <= num; i++) { //Rows
            for (j = 1; j <= num; j++) { //Columns
                if (i == 1 || i == num || j == 1 || j == num || i == j || j == num - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        printSquareStar(5);
        printSquareStar(8);
    }
}
