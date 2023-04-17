package Prac7;

public class Practice7 {
    /**
     * Arrays Practices Series 1, Soale 14
     * Create an array of 25 integers and find the first occurrence of the number 10.
     * use linear serach algorithm for this question.
     */
    public static void firstTenIndex (int[] array, int key) {
        int last = array.length - 1;
        for (int i = 0; i < last; i++) {
            if (array[i] == key) {
                System.out.println("Key is found at index " + i);
                return;
            }
        }
        System.out.println("key not found!");
    }

    /**
     * Arrays Practices Series 1, Soale 15.
     * Create an array of 30 strings and find the index of the first occurrence of the string "hello".
     * use linear search algorithm for this question.
     */
    public static void firstHelloIndex(String[] array, String key) {
        int count = array.length - 1;
        for (int i = 0; i < count; i++) {
            if (key.equals(array[i])) {
                System.out.println("Key is found at index " + i);
                return;
            }
        }
        System.out.println("Key not found!");
    }

    /**
     * Ternary Operator - Soale 3
     * Write a Java program that takes a string as input from the user and determines whether it contains the substring "hello".
     * If it does contain the substring, the program should print "The string contains hello",
     * otherwise it should print "The string does not contain hello".
     * Use the ternary operator to accomplish this task.
     */
    public static String checkHelloInString(String word) {
        return word.contains("hello") ? "The string contains hello" : "The string does not contain hello";
    }

    public static void main(String[] args) {

        /* Arrays Practices Series 1, Soale 14 - Create an array of 25 integers and find the first occurrence of the number 10 */
        System.out.println("Arrays Practices Series 1, Soale 14 - Create an array of 25 integers and find the first occurrence of the number 10");

        int[] nums = {1, 33, 5, 6, 7, 8, 22, 76, 24, 10, 514, 1232, 555, 3535, 666, 2331, 8237, 55, 26, 73, 64, 223, 831, 756, 983};
        firstTenIndex(nums, 10);

        System.out.println("**********");

        /* Arrays Practices Series 1, Soale 15 - Create an array of 30 strings and find the index of the first occurrence of the string "hello" */
        System.out.println("Arrays Practices Series 1, Soale 15 - Create an array of 30 strings and find the index of the first occurrence of the string \"hello\"");

        String[] words = {"sajjad", "emami", "rad", "mohammad", "java", "hello", "abbas", "ali", "daneshgah", "spring", "computer", "key", "index"};
        firstHelloIndex(words, "hello");

        System.out.println("**********");

        /*
          Arrays Practice Series 2 - Soale 8
          Create a class called Circle that has a private field for radius.
          Include getter and setter methods for the radius,
          and a method to calculate the circumference of the circle.
          Create an array of 9 Circle objects and print out the radius and circumference of each circle.
         */
        System.out.println("Arrays Practice Series 2 - Soale 8");

        Circle[] circles = new Circle[3];
        circles[0] = new Circle(10);
        circles[1] = new Circle(6.5);
        circles[2] = new Circle(15);
        for (Circle circle : circles) {
            System.out.println(circle.calculateCircumference());
        }

        System.out.println("**********");

        /*
         * Arrays Practice Series 2 - Soale 5
         * Create a class called Student that has private fields for name, age, and grades (an array of integers).
         * Include getter and setter methods for name and age, and a method to calculate the average grade.
         * Create an array of 4 Student objects and print out the name, age, and average grade of each student.
         */
        System.out.println("Arrays Practice Series 2 - Soale 5");

        Student[] students = new Student[3];
        students[0] = new Student("sajjad", 20, new int[]{15, 16, 18, 20});
        students[1] = new Student("abbas", 18, new int[]{17, 10, 11, 13});
        students[2] = new Student("ebrahim", 22, new int[]{15, 8, 20, 11});
        for (Student student : students) {
            System.out.println(student.getName());
            System.out.println(student.getAge());
            System.out.println(student.calculateAvgGrade());
        }

        System.out.println("**********");

        /*
         * Arrays Practice Series 2 - Soale 10
         * Create a class called Course that has private fields for name and students (an array of Student objects).
         * Include getter and setter methods for the name and students, and a method to calculate the average grade of all the students in the course.
         * Create an array of 2 Course objects, each with 3 students, and print out the name of each course and the average grade of all the students in the course.
         */
        System.out.println("Arrays Practice Series 2 - Soale 10");

        Course[] courses = new Course[2];
        Student[] students2 = new Student[3];
        students2[0] = new Student("mohammad", 21, new int[]{11, 12, 13, 15});
        students2[1] = new Student("sepehr", 22, new int[]{15, 16, 17, 18});
        students2[2] = new Student("kian", 25, new int[]{16, 17, 18, 19});
        courses[0] = new Course("java", students);
        courses[1] = new Course("cpp", students2);
        for (Course course : courses) {
            System.out.println(course.courseAvgGrade());
        }

        System.out.println("**********");

        /*
         * practice about using object as arguments of methods or return type of methods - Soale 6
         * Create a class called BankAccount with properties for balance and account number.
         * Write a method that takes in an array of BankAccount objects and returns the total balance of all the accounts in the array.
         */
        System.out.println("practice about using object as arguments of methods or return type of methods - Soale 6");

        BankAccount account1 = new BankAccount(115, 1);
        BankAccount account2 = new BankAccount(120, 12);
        BankAccount account3 = new BankAccount(50, 13);
        BankAccount[] accounts = new BankAccount[]{account1, account2, account3};
        System.out.println(BankAccount.calcTotalBalance(accounts));

        System.out.println("**********");

        /*
         * practice about using object as arguments of methods or return type of methods - Soale 10
         * Create a class called Customer with properties for name and total purchases.
         * Write a method that takes in an array of Customer objects and returns the name of the customer with the highest total purchases.
         */
        System.out.println("practice about using object as arguments of methods or return type of methods - Soale 10");

        Customer[] customers = new Customer[3];
        customers[0] = new Customer("sajjad", 20);
        customers[1] = new Customer("kian", 10);
        customers[2] = new Customer("sepehr", 5);
        System.out.println(Customer.loyalCustomer(customers));

        System.out.println("**********");

        /*
         * inheritance practices - Soale 1
         * Create a class Animal with a String field name and an int field age.
         * Create a constructor that initializes these fields.
         * Create a method speak that prints "I am an animal."
         */
        System.out.println("inheritance practices - Soale 1");

        Animal animal = new Animal("jack", 12);
        animal.speak();

        System.out.println("**********");

        /*
         * inheritance practices - Soale 8
         * Create a class Mammal that extends Animal.
         * Add a boolean field isWarmBlooded and a constructor that initializes it.
         * Override the speak method to print "I am a mammal."
         */
        System.out.println("inheritance practices - Soale 8");

        Mammal mammal = new Mammal("mammal", 2, true);
        mammal.speak();

        System.out.println("**********");

        /*
         * inheritance practices - Soale 9
         * Create a class Human that extends Mammal.
         * Add a String field firstName, a String field lastName, and a constructor that initializes these fields.
         * Override the speak method to print "My name is [first name] [last name]."
         */
        System.out.println("inheritance practices - Soale 9");

        Human human = new Human("sajjad", "emami", 20);
        human.speak();

        System.out.println("**********");

        /*
         * Ternary Operator - Soale 3
         * Write a Java program that takes a string as input from the user and determines whether it contains the substring "hello".
         * If it does contain the substring, the program should print "The string contains hello",
         * otherwise it should print "The string does not contain hello".
         * Use the ternary operator to accomplish this task.
         */

        System.out.println("Ternary Operator - Soale 3");

        System.out.println(checkHelloInString("hello world!"));
        System.out.println(checkHelloInString("salam donya!"));

        System.out.println("**********");

    }
}
