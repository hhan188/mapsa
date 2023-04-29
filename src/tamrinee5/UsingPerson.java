package com.mapsahr.practice7;

public class UsingPerson {
    public static void main(String[] args){
        Person[] person=new Person[5];
        person[0]=new Person("sara",43,"marzdaran");
        person[1]=new Person("amir",16,"janat abad");
        person[2]=new Person("mehrab",24,"poonak");
        person[3]=new Person("zahra",31,"vanak");
        person[4]=new Person("ariana",29,"sadeghie");
        System.out.println(person[0].getname()+" "+person[0].getAge());
        System.out.println(person[1].getname()+" "+person[1].getAge());
        System.out.println(person[2].getname()+" "+person[2].getAge());
        System.out.println(person[3].getname()+" "+person[3].getAge());
        System.out.println(person[4].getname()+" "+person[4].getAge());

        System.out.println(average(person));


    }

    public static int average (Person[] person){
        int sum=0;
        for (Person item:person){
            sum+=item.getAge();

        }
        System.out.print("their average is:");
        return sum/5;

    }
}
