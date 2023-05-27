package practices.practice14.exercise03;

import java.util.Arrays;
import java.util.Scanner;
public class Utils {
    public static int readInteger(){
        System.out.print("Please Enter A Length For Arrays: ");
        Scanner scanner=new Scanner(System.in);
        return scanner.nextInt();
    }
    public static Integer[] readElements(int length) {
        int count = 0;
        Integer[] integers = new Integer[length];
        while (count < length) {
            System.out.print("Element " + count + " is:");
            Scanner scanner = new Scanner(System.in);
            integers[count++] = scanner.nextInt();
        }
        return integers;
    }
  public static int  findMin(Integer[] integers){
      Arrays.sort(integers);
      return integers[0];
  }
}
