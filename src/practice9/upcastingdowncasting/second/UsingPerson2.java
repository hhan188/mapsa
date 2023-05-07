package practice9.upcastingdowncasting.second;

import practice9.upcastingdowncasting.second.Person2;
import practice9.upcastingdowncasting.second.Student2;
import practice9.upcastingdowncasting.second.Teacher2;

public class UsingPerson2 {
    public static void main(String[] args){
        Person2 person=new Person2();
        Teacher2 teacher=new Teacher2();
        Student2 student=new Student2();

        //upcast
//        Dog myDog = new Dog();
//        Animal myAnimal = myDog;

        Person2 newTeacher=teacher;
        newTeacher.introduce();

        Person2 newStudent=student;
        newStudent.introduce();

        //downcast
//        Animal myAnimal = new Dog();
//        Dog myDog = (Dog) myAnimal;
//
        //Person2 person=new Teacher2();
        Person2 person2=new Teacher2();
        Teacher2 newPerson=(Teacher2) person2;
        newPerson.introduce();




    }
}
