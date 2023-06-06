package practice9.Generics1.tamrine1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pair<T,U> {
    private T name;
    private U age;

    public Pair(T name, U age) {
        this.name = name;
        this.age = age;
    }

    public T getName() {
        return name;
    }

    public U getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Pair<String,Integer> inBox=new Pair<>("Zahra",23);
        System.out.println(inBox);
        System.out.println(inBox.getName());
        System.out.println(inBox.getAge());

}}


    



