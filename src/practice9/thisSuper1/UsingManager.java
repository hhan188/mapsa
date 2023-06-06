package practice9.thisSuper1;

import practice9.thisSuper1.Manager;

public class UsingManager {
    public static void main(String[] args){
        Manager manager=new Manager("Armin",23,12000.0,"Nasa");
        System.out.println(manager.getName()+" "+manager.getAge()+" "+manager.getSalary()+" "+manager.getDepartment());
    }
}
