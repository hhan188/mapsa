package tamrin27far;

import java.util.Scanner;

public class p4 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("محدوده پایین خود را مشخص کنید:");
        int bL = scanner.nextInt();
        System.out.println("محدوده بالا خود را مشخص کنید :");
        int bH = scanner.nextInt();
        System.out.println("عدد مورد نظر خود را وارد کتید");
        int n = scanner.nextInt();

        System.out.println( bL <= n &&  bH > n );
//using boolean
    }
}
