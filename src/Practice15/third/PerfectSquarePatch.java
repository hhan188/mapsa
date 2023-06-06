package Practice15.third;

import java.util.Arrays;
import java.util.Scanner;

public class PerfectSquarePatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number=scanner.nextInt();
        int c[][]=new int[number][number];
        for(int i=0;i<number;i++){
            for(int j=0;j<number;j++){
                c[i][j]=c[i][j];
                System.out.print( " "+number);
            }
            System.out.println();
        }

    }

}
