package Practice10.Second;

public class Person {
    private String firstName;
    private String secondName;
    private int age;

    public Person(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        this.age = age;
        if (age<0|| age>100){
            return this.age=0;
        }
        return age;
    }
    public boolean isTeen(){
        if (age>=12|| age<=20){
            return true;
        }return false;
    }
    public void getFullName(){
        if (firstName==null && secondName==null){
            System.out.println("");
        }if (firstName==null){
            System.out.println(secondName);
        }if (secondName==null){
            System.out.println(firstName);
        }else
        System.out.println(firstName+" "+secondName);
    }
}
