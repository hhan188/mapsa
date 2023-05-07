package practice9.interface1;

import practice9.interface1.Car3;
import practice9.interface1.House3;
import practice9.interface1.Person3;
import practice9.interface1.Sortable;

import java.util.ArrayList;
import java.util.List;

public class UsingSortable {
    public static void main(String[] args){
        List<Sortable> sortables=new ArrayList<>();


        Person3 person=new Person3();
        House3 house=new House3();
        Car3 car=new Car3();

        sortables.add(person);
        sortables.add(house);
        sortables.add(car);

        for (Sortable items:sortables){
            items.compare();
        }

    }

















}
