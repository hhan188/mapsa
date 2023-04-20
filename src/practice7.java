public class practice7 {
    ///arrays

//
//    3-Create an array of 5 doubles and initialize each element to 1.0.


//public static void main(String[] args){
//    double[] numbers=new double[5];
//    for (int i=0;i<5;i++){
//        numbers[i]=1.0;
//    }
//    System.out.println(Arrays.toString(numbers));
//
//}
//
//
//    4-Declare an array of 100 integers and fill it with random numbers between 1 and 1000.

//    public static void main(String[] args){
//        int[] numbers=new int[100];
//        for (int i=0;i<100;i++){
//            numbers[i]=(int)(Math.random()*1000);
//        }
//        System.out.println(Arrays.toString(numbers));
//
//    }
//
//
//    5-Create an array of 6 doubles and find the average of all the elements.

//    public static void main(String[] args){
//        double[] numbers={4.6,7.6,8.2,5.1,9.0,4.0};
//        double sum=0.0;
//        double average=1.0;
//        for (int i=0;i<4;i++){
//            sum+=numbers[i];
//            average=sum/6;
//        }
//        System.out.println(average);
//
//    }


//
//
//    6-Create an array of 12 doubles and find the smallest element.

//    public static void main(String[] args){
//        double[] numbers={5.34,8.0,34.6,76.5,4.9,7.6,32.9};
//        double smallest=numbers[0];
//        for (double i:numbers){
//            if (smallest>i){
//                smallest=i;
//            }
//        }
//        System.out.println(smallest);
//    }
//
//
//    7-Create an array of 15 integers and sort the elements in ascending order.
//public static void main(String[] args){
//    //adding corresponding elements
//    int[] numbers={6,8,3,5,1,98,23,7};
//    int[] numbers2={7,45,3,5,55,2,1,8};
//    int sum=0;
//    for (int i:numbers){
//        for (int t:numbers2){
//            if(t==i){
//                sum+=i;
//            }
//
//        }
//    }
//    System.out.println(sum);
//}
//
//
//    8-Create two arrays of 5 integers each and add the corresponding elements of the arrays.
//public static void main(String[] args){
//    //adding corresponding elements
//    int[] numbers={6,8,3,5,1,98,23,7};
//    int[] numbers2={7,45,3,5,55,2,1,8};
//    int sum=0;
//    for (int i:numbers){
//        for (int t:numbers2){
//            if(t==i){
//                sum+=i;
//            }
//
//        }
//    }
//    System.out.println(sum);
//}
//
//
//    9-Create two arrays of 7 doubles each and multiply the corresponding elements of the arrays.
//public static void main(String[] args){
//    double[] numbers={3.5,2.6,6.7,4.2,4.5,2.5,3.3};
//    double[] numbers2={6.4,6.7,3.6,8.5,3.5,2.6,4.2};
//    double mul=1;
//    for (double item :numbers){
//        for (double item2:numbers2) {
//            if (item == item2) {
//                mul *= item;
//            }
//        }
//
//    }
//    System.out.println(mul);
//
//
//}
//
//
//    10-Create an array of 20 integers and remove all duplicates from the array.
//public static void main(String[] args) {
//    //removing duplicates
//    int arr[] = { 1, 3, 3, 4, 2, 1, 5, 6, 7, 7, 8, 10 };
//    int[] newArr=new int[arr.length];
//    //1123345677810
//    Arrays.sort(arr);
//    int counter= 0;
//    for (int i = 0; i < arr.length - 1; i++) {
//        if (arr[i] != arr[i + 1]) {
//            newArr[counter] = arr[i];
//            counter++;
//        }
//    }
//    newArr[counter] = arr[arr.length - 1];//baraye inke akharin element ja namoone.
//    for (int i = 0; i <= counter; i++) {
//        System.out.println(newArr[i]);
//    }
//
//}
//
//
//    11-Create an array of 25 integers and find the first occurrence of the number 10.
//public static void main(String[] args) {
//    //firstAppearanceOf10
//    int[] numbers = {4, 6, 2, 10, 8, 3, 5, 9, 10, 4, 1, 0, 9, 7, 6, 5, 4, 3};
//    for (int i = 0; i < 19; i++) {
//        if (numbers[i] == 10) {
//            System.out.println(i);
//            break;
//        }
//
//    }
//
//}
//
//
//    12-Create an array of 30 strings and find the index of the first occurrence of the string "hello".
//public static void main(String[] args){//firstAppearanceOfHello
//    String[] strs={"efe","ttry","hghf","hello","dsfd","hello"};
//    for (int i=0;i<6;i++){
//        if(strs[i]=="hello"){
//            System.out.println(i);
//            break;
//
//        }
//    }
//}
//TernaryOperators Easy
//   public static void main(String[] args){
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("please enter your boolean:");
//        String bool=scanner.nextLine();
//        String result=bool.equals(true)?"yes":"no";
//        System.out.println(result);


//        Scanner scanner=new Scanner(System.in);
//        System.out.println("please enter your first integer:");
//        int number=scanner.nextInt();
//        Scanner scanner2=new Scanner(System.in);
//        System.out.println("please enter your second integer:");
//        int number2=scanner.nextInt();
//        int result=number<number2?number:number2;
//        System.out.println(result);
//
//
//    }
//ternaryOperator Medium
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("please enter your first integer:");
//        int number1=scanner.nextInt();
//        Scanner scanner2=new Scanner(System.in);
//        System.out.println("please enter your second integer:");
//        int number2=scanner.nextInt();
//        Scanner scanner3=new Scanner(System.in);
//        System.out.println("please enter your third integer:");
//        int number3=scanner.nextInt();
//        int result=(number1>number2 && number1>number3)?number1:number2>number3?number2:number3;
//        System.out.println(result);

//    Scanner scanner=new Scanner(System.in);
//        System.out.print("please enter your grade:");
//    int grade=scanner.nextInt();
//    String result=grade>=60?"passed":"fail";
//        System.out.println(result);

//TernaryOperator Difficult

//        Scanner scanner=new Scanner(System.in);
//        System.out.println("please enter the string:");
//        String str= scanner.nextLine();
//        String answer=str.indexOf("a")>=0?"vowels present":str.indexOf("e")>=0?"vowels present":
//                str.indexOf("i")>=0?"vowels present":str.indexOf("o")>=0?"vowels present":str.indexOf("u")>=0?
//                        "vowels present":"no vowels";
//        System.out.println(answer);

//        Scanner scanner=new Scanner(System.in);
//        System.out.println("please enter your first integer:");
//        int number1=scanner.nextInt();
//        Scanner scanner2=new Scanner(System.in);
//        System.out.println("please enter your second integer:");
//        int number2=scanner.nextInt();
//        Scanner scanner3=new Scanner(System.in);
//        System.out.println("please enter your third integer:");
//        int number3=scanner.nextInt();
//        int result=(number1>number2 && number1>number3)?number1:number2>number3?number2:number3;
//        System.out.println(result);


///}
//---------------------------

//public class BankAccount {
//    private int balance;
//    private String accountNumber;
//
//    public void setBalance(int balance) {
//        this.balance = balance;
//    }
//
//    public int getBalance() {
//        return balance;
//    }
//
//    public void setAccountNumber(String accountNumber) {
//        this.accountNumber = accountNumber;
//    }
//
//    public String getAccountNumber() {
//        return accountNumber;
//    }
//
//    public BankAccount(int balance,String accountNumber){
//        this.balance=balance;
//        this.accountNumber=accountNumber;
//    }
//}
//----------------
//public class Book {//Class using book
//    private String title;
//    private String author;
//    private int pages;
//    private String category;
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public void setPages(int pages) {
//        this.pages = pages;
//    }
//
//    public int getPages() {
//        return pages;
//    }
//
//    public void setCategory(String category) {
//        this.category = category;
//    }
//
//    public String getCategory() {
//        return category;
//    }
//
//    public Book(String title, String author, int pages,String category){
//        this.title=title;
//        this.author=author;
//        this.pages=pages;
//        this.category=category;
//    }
//}
//-----------

//public class Car extends Vehicle{
//    private int numberOfDoors;
//
//
//    public void setNumberOfDoors(int numberOfDoors){
//        this.numberOfDoors=numberOfDoors;
//    }
//    public int getNumberOfDoors(){
//        return numberOfDoors;
//    }
//
//
//
//    @Override
//    public void startEngine(){
//        System.out.println("Car engine started.");
//    }
//
//
//}

//public class Vehicle {//Car class
//    private int maxSpeed;
//
//
//    public void startEngine(){
//        System.out.println("Engine started.");
//    }
//}

//
//public class Car2 {
//    private String name;
//    private String make;
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setMake(String make) {
//        this.make = make;
//    }
//
//    public String getMake() {
//        return make;
//    }
//    public Car2(String name,String make){
//        this.name=name;
//        this.make=make;
//    }
//}

//public class Shape {//Circle class
//    private String color;
//
//    public String getColor(String color){
//        return color;
//    }
//
//}

//public class Circle extends Shape {
//    private int radius;
//
//    public void setRadius(int radius) {
//        this.radius = radius;
//    }
//
//    public int getRadius() {
//        return radius;
//    }
//
//    @Override
//    public String getColor(String color) {
//        System.out.println(color);
//        return super.getColor("red");
//
//
//    }


//public class Circle2 {//tamrine 16
//    private int radius;
//
//    public void setRadius(int radius) {
//        this.radius = radius;
//    }
//
//    public int getRadius() {
//        return radius;
//    }
//
//    public Circle2(int radius){
//
//        this.radius=radius;
//    }
//
//    public double circumference(){
//        return 2*3.14*radius;
//    }
//}
//
//============
//
//public class Shape2 {//circle2Shape
//    private String color;
//    private String  filled;
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setFilled(String filled) {
//        this.filled = filled;
//    }
//
//    public String getFilled() {
//        return filled;
//    }
//
//    public Shape2(String color, String filled){
//        this.color=color;
//        this.filled=filled;
//
//    }
//
//    public double getArea(){
//        return 1;
//    }
//}

//public class Circle2Shape extends Shape2 {
//    private int radius;
//
//    public void setRadius(int radius) {
//        this.radius = radius;
//    }
//
//    public int getRadius() {
//        return radius;
//    }
//
//    public Circle2Shape(String color, String filled,int radius){
//        super(color,filled);
//        this.radius=radius;
//    }
//
//    @Override
//    public double getArea(){
//        return radius*3.14;
//    }
//}


//public class Rectangle2 extends Shape2 {
//    private int height;
//    private int width;
//
//    public void setHeight(int height) {
//        this.height = height;
//    }
//
//    public int getHeight() {
//        return height;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//    public Rectangle2(String color,String filled,int height,int width){
//        super(color,filled);
//        this.height=height;
//        this.width=width;
//    }
//    @Override
//    public double getArea(){
//        return height*width;
//    }
//}

//public class Square2 extends Rectangle2{
//    private int sideLength;
//
//    public void setSideLength(int sideLength) {
//        this.sideLength = sideLength;
//    }
//
//    public int getSideLength() {
//        return sideLength;
//    }
//
//    public Square2(String color, String filled, int sideLength){
//        super(color,filled,12,3);
//        this.sideLength=sideLength;
//    }
//
//    @Override
//    public double getArea(){
//        return sideLength*getHeight()*getWidth();
//    }
//
//}

//-----------------------------
//public class Circle3 {
//    private int radius;
//
//    public void setRadius(int radius) {
//        this.radius = radius;
//    }
//
//    public int getRadius() {
//        return radius;
//    }
//
//    public Circle3(int radius){
//        this.radius=radius;
//
//    }
//
//    public double getArea(){
//        return radius*radius*3.14;
//    }
//}
//
//-----------------------------

//public class Employee {
//    private int salary;
//    private int bonus;
//
//    public void setSalary(int salary) {
//        this.salary = salary;
//    }
//
//    public int getSalary() {
//        return salary;
//    }
//
//    public void setBonus(int bonus) {
//        this.bonus = bonus;
//    }
//
//    public int getBonus() {
//        return bonus;
//    }
//
//    public Employee(int salary, int bonus){
//        this.salary=salary;
//        this.bonus=bonus;
//    }
//}
//
//
//--------------

//
//public class Person {//UsingPerson main class
//    private String name;
//    private int age;
//    private String address;
//    public void setName(String name){
//        this.name=name;
//    }
//    public String getname(){
//        return name;
//    }
//
//    public void setAge(int age){
//        this.age=age;
//    }
//
//    public int getAge(){
//        return age;
//    }
//
//    public void setAddress(String address){
//        this.address=address;
//
//    }
//    public String getAddress(){
//        return address;
//    }
//
//    public Person(String name,int age,String address){
//        this.name=name;
//        this.age=age;
//        this.address=address;
//    }
//}

//public class Product {
//    private String name;
//    private int price;
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//    public Product(String name,int price){
//        this.name=name;
//        this.price=price;
//    }
//}

//
//public class Student1 {//tamrin15
//    private String name;
//    private int age;
//    private int[] grades;
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setGrades(int[] grades) {
//        this.grades = grades;
//    }
//
//    public int[] getGrades() {
//        return grades;
//    }
//
//    public int averageGrade(){
//        int sum=0;
//        for (int i=0 ;i<3;i++){
//            sum+=grades[i];
//
//        }
//        return sum/3;
//    }
//
//    public Student1(String name,int age,int[] grades){
//        this.name=name;
//        this.age=age;
//        this.grades=grades;
//    }
//}

//----------------------
//public class Student2 {
//
//    public String name;
//
//    public int gpa;
//
//
//    public void setName(String name){
//        this.name=name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setGpa(int gpa){
//        this.gpa=gpa;
//    }
//
//    public int getGpa() {
//        return gpa;
//    }
//
//    public Student2 (String name, int gpa){
//        this.name=name;
//        this.gpa=gpa;
//
//    }
//}



}
