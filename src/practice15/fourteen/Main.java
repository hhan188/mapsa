package practice15.fourteen;

import java.util.ArrayList;
import java.util.Scanner;

import static practice15.fourteen.StateName.filterStateName;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Arizona");
        stringArrayList.add("CA");
        stringArrayList.add("NY");
        stringArrayList.add("Nevada");

        ArrayList<String> stringArrayList1 = new ArrayList<>();
        stringArrayList1.add("MT");
        stringArrayList1.add("NJ");
        stringArrayList1.add("TX");
        stringArrayList1.add("ID");
        stringArrayList1.add("IL");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Function :");
        String function = scanner.nextLine();
        System.out.println(filterStateName(stringArrayList1, function));

    }
}
