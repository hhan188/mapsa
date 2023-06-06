package practice9.thisSuper2;

import practice9.thisSuper2.Person;

public class Student extends Person {

    private String major;


    public Student(String name, int age,String gender,String major){
        super(name,age,gender);
        this.major=major;



    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
