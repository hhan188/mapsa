package com.tamrin7;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Random;

public class Practices7
{
    public void tamrin1 ()
    {
        Car car1 = new Car();
        System.out.println("Tamrin 1: ");
        car1.startEngine();
        System.out.println();
    }

    public void tamrin2 ()
    {
        Circle shape1 = new Circle();
        System.out.println("Tamrin 2: ");
        System.out.println(shape1.getColor());
        System.out.println();
    }

    public void tamrin4 ()
    {
        int [] t4Array = new int[100];
        Random rand = new Random();
        System.out.println("Tamrin 4: ");
        for (int i=0; i<t4Array.length; i++)
        {
            t4Array [i] = rand.nextInt(1000);
        }
        for (int item : t4Array)
        {
            System.out.println(item);
        }
        System.out.println();
    }

    public void tamrin5 ()
    {
        double [] t5Array = {3.21, 15.9, 75.4, 66.24, 93.45, 50.78};
        double sum =0;
        for (int i=0; i<t5Array.length; i++)
        {
            sum += t5Array [i];
        }
        System.out.println("Tamrin 5: ");
        System.out.println(sum / t5Array.length);
        System.out.println();
    }

    public void tamrin6 ()
    {
        double [] t6Array = {5.3, 6.1, 1.4, 4.5, 8.1, 0.2, 4.1, 9.6, 7.3, 2.8, 1.1, 6.7};
        double smallest = t6Array [0];
        for (int i=1; i<t6Array.length; i++)
        {
            if (smallest > t6Array[i])
            {
                smallest = t6Array [i];
            }
        }
        System.out.println("Tamrin 6: ");
        System.out.println(smallest);
        System.out.println();
    }

    public void tamrin7 ()
    {
        int [] t7Array = {5, 3, 6, 11, 4, 8, 2, 41, 96, 73, 28, 1, 67, 9, 50};
        int temp = 0;

        for ( int i=0; i < t7Array.length; i++)
        {
            for (int j=0; j < t7Array.length; j++)
            {
                if (t7Array[i] < t7Array[j])
                {
                    temp = t7Array[i];
                    t7Array [i] = t7Array[j];
                    t7Array[j] = temp;
                }
            }
        }
        System.out.println("Tamrin 7: ");
        System.out.println(Arrays.toString(t7Array));
        System.out.println();
    }

    public void tamrin8 ()
    {
        int [] t8Array = {6, 4, 9, 36, 54};
        int [] t8Array2 = {35, 60, 5, 3, 9};
        int secondArrayLenght = t8Array2.length-1;
        System.out.println("Tamrin 8: ");
        for (int i=0; i<t8Array.length; i++)
        {
            System.out.print(t8Array[i] + t8Array2[secondArrayLenght--]);
            if (i == t8Array.length-1)
            {
                break;
            }
            System.out.print(", ");
        }
        System.out.println();
        System.out.println();
    }


    public void tamrin9 ()
    {
        int [] t9Array = {6, 4, 9, 36, 54};
        int [] t9Array2 = {35, 60, 5, 3, 9};
        int secondArrLen = t9Array2.length-1;

        System.out.println("Tamrin 9: ");
        for (int i=0; i<t9Array.length; i++)
        {
            System.out.print(t9Array[i] * t9Array2[secondArrLen--]);
            if (i == t9Array.length-1)
            {
                break;
            }
            System.out.print(", ");
        }
        System.out.println();
        System.out.println();
    }


    public void tamrin10 ()
    {
        int [] t10Array = {5, 6, 44, 98, 5, 34, 44, 52, 6, 72, 66, 41, 84, 25, 14, 72, 52, 75, 2, 70};
        LinkedHashSet<Integer> t10Array2 = new LinkedHashSet<Integer>();

        for (int i = 0; i < t10Array.length; i++)
        {
            t10Array2.add(t10Array[i]);
        }

        System.out.println("Tamrin 10:");
        System.out.println(Arrays.toString(t10Array2.toArray()));
        System.out.println();
    }


    public void tamrin11 ()
    {
        int [] t11Array = {3, 2, 6, 5, 4, 12, 15, 10, 21, 29, 34, 42, 50, 10, 63, 75, 86, 90, 102, 113, 124, 136, 148, 158, 167};
        System.out.println("Tamrin 11: ");
        for (int i=0; i < t11Array.length; i++)
        {
            if (t11Array[i] == 10)
            {
                System.out.println("Index " + (i+1) + " is 10");
                break;
            }
        }
        System.out.println();
    }


    public void tamrin12 ()
    {
        String [] t12Array = {"fruit", "drupe", "cherry", "small", "yellow", "round", "clear", "audio", "pronunciations", "words", "phrases", "American", "English", "tree", "popular", "one", "search", "Advanced", "Academic", "Content", "Business", "hello", "name", "car", "Students", "Book", "Phone", "java", "Spring", "Hope"};
        System.out.println("Tamrin 12: ");
        for (int i=0; i < t12Array.length; i++)
        {
            if (t12Array[i].equalsIgnoreCase("hello") )
            {
                System.out.println("Index " + (i+1) + " is Hello");
                break;
            }
        }
        System.out.println();
    }


    public void tamrin13 ()
    {
        Person [] persons= new Person[5];
        for (int i=0; i < persons.length; i++)
        {
            persons[i] = new Person();
        }
        persons[0].setName("Ramin");
        persons[0].setAge(28);

        persons[1].setName("Mohsen");
        persons[1].setAge(17);

        persons[2].setName("MohammadReza");
        persons[2].setAge(26);

        persons[3].setName("Qolam");
        persons[3].setAge(4);

        persons[4].setName("Heshmat");
        persons[4].setAge(7);
        System.out.println("Tamrin 13: ");
        for (int i=0; i < persons.length; i++)
        {
            System.out.println("Name: " + persons[i].getName() + " | Age: " + persons[i].getAge());
        }
        System.out.println();
    }


    public void tamrin14 ()
    {
        Book [] books = new Book[7];
        for (int i=0; i < books.length; i++)
        {
            books[i] = new Book();
        }
        books[0].setTitle("Book 1");
        books[0].setAuthor("Book 1 Author");
        books[0].setNumberOfPages(10);

        books[1].setTitle("Book 2");
        books[1].setAuthor("Book 2 Author");
        books[1].setNumberOfPages(20);

        books[2].setTitle("Book 3");
        books[2].setAuthor("Book 3 Author");
        books[2].setNumberOfPages(30);

        books[3].setTitle("Book 4");
        books[3].setAuthor("Book 4 Author");
        books[3].setNumberOfPages(40);

        books[4].setTitle("Book 5");
        books[4].setAuthor("Book 5 Author");
        books[4].setNumberOfPages(50);

        books[5].setTitle("Book 6");
        books[5].setAuthor("Book 6 Author");
        books[5].setNumberOfPages(60);

        books[6].setTitle("Book 7");
        books[6].setAuthor("Book 7 Author");
        books[6].setNumberOfPages(70);

        System.out.println("Tamrin 14: ");
        for (int i=0; i < books.length; i++)
        {
            System.out.println("Title: " + books[i].getTitle() + " | Author: " + books[i].getAuthor() + " | Number of Pages: " + books[i].getNumberOfPages());
        }
        System.out.println();
    }



    public void tamrin15 ()
    {
        Student [] students = new Student[4];
        for (int i=0; i < students.length; i++)
        {
            students [i] = new Student();
        }

        students[0].setName("Ramin");
        students[0].setAge(28);
        students[0].setGrades(new int[]{10, 16, 20, 18});

        students[1].setName("Ali");
        students[1].setAge(20);
        students[1].setGrades(new int[]{8, 6, 3, 5});

        students[2].setName("Mehdi");
        students[2].setAge(25);
        students[2].setGrades(new int[]{18, 16, 13, 15});

        students[3].setName("Saeed");
        students[3].setAge(31);
        students[3].setGrades(new int[]{12, 17, 14, 16});

        System.out.println("Tamrin 15: ");
        for (int i=0; i < students.length; i++)
        {
            System.out.println("Name: " + students[i].getName() + " | Age: " + students[i].getAge() + " | Average of Grades: " + students[i].avg(students[i].getGrades()));
        }
        System.out.println();
    }


    public void tamrin16 ()
    {
        Circle2 [] circle2s = new Circle2[9];
        for (int i=0; i < circle2s.length; i++)
        {
            circle2s[i] = new Circle2();
        }
        circle2s[0].setRadius(5);
        circle2s[1].setRadius(6);
        circle2s[2].setRadius(7);
        circle2s[3].setRadius(8);
        circle2s[4].setRadius(9);
        circle2s[5].setRadius(10);
        circle2s[6].setRadius(11);
        circle2s[7].setRadius(12);
        circle2s[8].setRadius(13);

        System.out.println("Tamrin 16: ");
        for (int i=0; i < circle2s.length; i++)
        {
            System.out.println("Circumference of Circle " + (i+1) + " is: " + circle2s[i].calcCircumference());
        }
        System.out.println();
    }


    public void tamrin17 ()
    {
        Course [] courses = new Course[2];
        Student [] students1 = new Student[3];
        Student [] students2 = new Student[3];

        for (int i = 0; i < courses.length; i++)
        {
            courses[i] = new Course();
        }

        for (int i = 0; i < students1.length; i++)
        {
            students1[i] = new Student();
        }

        students1[0].setName("Ramin");
        students1[1].setName("Reza");
        students1[2].setName("Hosein");
        students1[0].setGrades(new int[]{15, 18, 20});
        students1[1].setGrades(new int[]{16, 14, 10});
        students1[2].setGrades(new int[]{19, 13, 17});


        for (int i = 0; i < students2.length; i++)
        {
            students2[i] = new Student();
        }

        students2[0].setName("Ali");
        students2[1].setName("Hadi");
        students2[2].setName("Hasan");
        students2[0].setGrades(new int[]{15, 18, 20});
        students2[1].setGrades(new int[]{16, 14, 10});
        students2[2].setGrades(new int[]{19, 13, 17});

        courses[0].setName("Java SE");
        courses[0].setStudents(students1);

        courses[1].setName("Java EE");
        courses[1].setStudents(students2);

        System.out.println("Tamrin 17: ");
        for (int j = 0; j < students1.length; j++)
        {
            System.out.println("Course Name: " + courses[0].getName() + " | Student Name: " + students1[j].getName() + " | Average: " + courses[0].calcAVGGrade(students1[j]));
        }

        for (int j = 0; j < students1.length; j++)
        {
            System.out.println("Course Name: " + courses[1].getName() + " | Student Name: " + students2[j].getName() + " | Average: " + courses[1].calcAVGGrade(students2[j]));
        }
        System.out.println();
    }

    public void tamrin27 ()
    {
        //---------------------------------------------------------------------------------
        //Tamrin 27-1
        System.out.println("Tamrin 27-1:");
        boolean isTrue = false;
        System.out.println((isTrue ? "Yes" : "No"));
        System.out.println();


        //---------------------------------------------------------------------------------
        //Tamrin 27-2
        System.out.println("Tamrin 27-2:");
        int a = 20;
        int b = 30;
        System.out.println((a<b ? "A is Minimum" : "B is Minimum"));
        System.out.println();


        //---------------------------------------------------------------------------------
        //Tamrin 27-3
        System.out.println("Tamrin 27-3:");
        int x = 12;
        int y = 8;
        int z = 15;
        System.out.println((x>y && x>z) ? x : (y>x && y>z ? y : z));
        System.out.println();


        //---------------------------------------------------------------------------------
        //Tamrin 27-4
        System.out.println("Tamrin 27-4:");
        int grade = 60;
        System.out.println((grade >= 60 ? "pass" : "fail"));
        System.out.println();


        //---------------------------------------------------------------------------------
        //Tamrin 27-5
        System.out.println("Tamrin 27-5:");
        String word = "Skype";
        System.out.println((word.contains("a") || word.contains("e") || word.contains("i") || word.contains("o") || word.contains("u") ? "Vowels Present" : "No Vowels"));
        System.out.println();


        //---------------------------------------------------------------------------------
        //Tamrin 27-6
        System.out.println("Tamrin 27-6:");
        int i = 12;
        int j = 8;
        int k = 15;
        System.out.println((i>j && i>k) ? i : (j>i && j>k ? j : k));
        System.out.println();
    }
}
