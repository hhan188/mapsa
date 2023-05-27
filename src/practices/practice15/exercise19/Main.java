package practices.practice15.exercise19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static practices.practice15.exercise19.Utils.findSeat;

public class Main {
    public static void main(String[] args) {
        Integer[] carriages = {35, 23, 18, 10, 40};
        List<Integer> list = new ArrayList<>(Arrays.asList(carriages));
        System.out.println(findSeat(200, list));
        System.out.println("*****************************************");
        Integer[] carriages3 = {3, 5, 4, 2};
        List<Integer> list3 = new ArrayList<>(Arrays.asList(carriages3));
        System.out.println(findSeat(20, list3));
        System.out.println("*****************************************");
        Integer[] carriages1 = {50, 20, 80, 90, 100, 60, 30, 80, 60};
        List<Integer> list1 = new ArrayList<>(Arrays.asList(carriages1));
        System.out.println(findSeat(1000, list1));
        System.out.println("*****************************************");
        Integer[] carriages2 = {35, 23, 40, 21, 38};
        List<Integer> list2 = new ArrayList<>(Arrays.asList(carriages2));
        System.out.println(findSeat(200, list2));
    }
}
