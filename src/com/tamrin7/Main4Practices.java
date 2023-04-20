package com.tamrin7;

public class Main4Practices
{
    public static void main(String[] args)
    {

        Practices7 p7 = new Practices7();

        //---------------------------------------------------------------------------------
        //Tamrin 1

        p7.tamrin1();


        //---------------------------------------------------------------------------------
        //Tamrin 2

        p7.tamrin2();


        //---------------------------------------------------------------------------------
        //Tamrin 3

        double [] t3Array = {1.0, 1.0, 1.0, 1.0, 1.0};


        //---------------------------------------------------------------------------------
        //Tamrin 4

        p7.tamrin4();


        //---------------------------------------------------------------------------------
        //Tamrin 5

        p7.tamrin5();


        //---------------------------------------------------------------------------------
        //Tamrin 6

        p7.tamrin6();


        //---------------------------------------------------------------------------------
        //Tamrin 7

        p7.tamrin7();


        //---------------------------------------------------------------------------------
        //Tamrin 8

        p7.tamrin8();


        //---------------------------------------------------------------------------------
        //Tamrin 9

        p7.tamrin9();


        //---------------------------------------------------------------------------------
        //Tamrin 10

        p7.tamrin10();


        //---------------------------------------------------------------------------------
        //Tamrin 11

        p7.tamrin11();


        //---------------------------------------------------------------------------------
        //Tamrin 12

        p7.tamrin12();


        //---------------------------------------------------------------------------------
        //Tamrin 13

        p7.tamrin13();


        //---------------------------------------------------------------------------------
        //Tamrin 14

        p7.tamrin14();



        //---------------------------------------------------------------------------------
        //Tamrin 15

        p7.tamrin15();



        //---------------------------------------------------------------------------------
        //Tamrin 16

        p7.tamrin16();



        //---------------------------------------------------------------------------------
        //Tamrin 17

         p7.tamrin17();


        //---------------------------------------------------------------------------------
        //Tamrin 27
        p7.tamrin27();


    }

    //---------------------------------------------------------------------------------
    //Tamrin 18
    public static int averageAge (Person [] p)
    {
        int sum = 0;

        for (int i = 0; i < p.length; i++)
        {
            sum += p[i].getAge();
        }
        return sum / p.length;
    }



    //---------------------------------------------------------------------------------
    //Tamrin 19
    public static float totalAreaOfAllCircle (Circle2 [] c)
    {
        float totalArea = 0;

        for (int i = 0; i < c.length; i++)
        {
            totalArea += c[i].calcCircumference();
        }
        return totalArea;
    }



    //---------------------------------------------------------------------------------
    //Tamrin 20
    public static Book [] bookCategory(Book [] books, String category)
    {
        Book [] selectedBooks = new Book[books.length];
        for (int i = 0; i < books.length; i++)
        {
            if (books[i].getCategory().equalsIgnoreCase(category))
            {
                selectedBooks [i] = books[i];
            }
        }
        return selectedBooks;
    }



    //---------------------------------------------------------------------------------
    //Tamrin 21
    public static void highestGPA (Student [] students)
    {
        for (int i = 0; i < students.length; i++)
        {
            if (students[i].getGPA() >= 4)
            {
                System.out.println(students[i].getName());
            }
        }
    }



    //---------------------------------------------------------------------------------
    //Tamrin 22
    public static Car [] carBrand (Car [] cars, String make)
    {
        Car [] searchedCars = new Car[cars.length];
        for (int i=0; i < cars.length; i++)
        {
            if (cars[i].getMake().equalsIgnoreCase(make))
            {
                searchedCars [i] = cars[i];
            }
        }
        return searchedCars;
    }



    //---------------------------------------------------------------------------------
    //Tamrin 23
    public static long totalBalance (BankAccount [] bankAccounts)
    {
        long totalBlnc = 0;

        for (int i = 0; i < bankAccounts.length; i++)
        {
            totalBlnc += bankAccounts[i].getBalance();
        }

        return totalBlnc;
    }



    //---------------------------------------------------------------------------------
    //Tamrin 24
    public static String lowestPriceProduct (Product [] products)
    {
        int tempPrice = products[0].getPrice();
        int index = 0;
        for (int i = 1; i < products.length; i++)
        {
            if (tempPrice > products[i].getPrice())
            {
                tempPrice = products[i].getPrice();
                index = i;
            }
        }

        return products[index].getName();
    }



    //---------------------------------------------------------------------------------
    //Tamrin 25
    public static double bonus (Employee [] emp, double bonusPercentage)
    {
        double percent = bonusPercentage / 100;
        double bonusAmount = 0;
        double totalBonusAmount = 0;
        for (int i = 0; i < emp.length; i++)
        {
            bonusAmount = emp[i].getSalary();
            bonusAmount += bonusAmount * percent;
            emp[i].setSalary(bonusAmount);
            totalBonusAmount += bonusAmount;
        }
        return totalBonusAmount;
    }





}
