package tamrin6.P2;


 public class StudentRecord {
  private int age;
  private String name;
  private int gpa;
  private int ID;



  public StudentRecord (String name, int ID, int age, int gpa) {
     this.name =name;
     this.ID =ID;
     this.age =age;
     this.gpa =gpa;
  }

  public int getAge() {

   return age;
  }

  public void setAge(int age) {
   this.age = age;
  }

  public String getName() {
   return name;
  }

  public void setName(String name) {
   this.name = name;
  }

  public int getGpa() {
   return gpa;
  }

  public void setGpa(int gpa) {
   this.gpa = gpa;
  }

  public int getID() {
   return ID;
  }

  public void setID(int ID) {
   this.ID = ID;
  }
 }