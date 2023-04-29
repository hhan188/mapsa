package tamrinee5;

public class UsingStudent1 {
        public static void main(String[] args){
            Student1[] students=new Student1[4];
            students[0]=new Student1("sara",32,new int[] {12,7,20});
            students[1]=new Student1("zahra",19,new int[] {14,7,16});
            students[2]=new Student1("dorsa",23, new int[]{3,12,4});
            students[3]=new Student1("amir",17,new int[]{20,5,18});

            System.out.println("first student :"+students[0].getName()+" "+students[0].getAge()+" "+students[0].averageGrade());
            System.out.println("first student :"+students[1].getName()+" "+students[1].getAge()+" "+students[1].averageGrade());
            System.out.println("first student :"+students[2].getName()+" "+students[2].getAge()+" "+students[2].averageGrade());
            System.out.println("first student :"+students[3].getName()+" "+students[3].getAge()+" "+students[3].averageGrade());
        }
    }
