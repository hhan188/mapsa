### Inheritance 

--------------------
inheritance is an important concept in object-oriented programming that allows you to define a new class based on an existing class. The new class is called the "subclass" or "derived class", while the existing class is called the "superclass" or "base class".

The subclass inherits all the methods and fields of the superclass and can add its own methods and fields as well as override or extend the superclass methods.


```java
public class Animal {
    public void makeSound() {
        System.out.println("Animal is making a sound");
    }
}

public class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof!");
    }
}
```

In this example, the Animal class is the superclass, and the Dog class is the subclass. The Dog class inherits the makeSound() method from the Animal class, but it overrides it with its own implementation.

To create an instance of the Dog class, you would use the following code:

```java
Dog myDog = new Dog();
myDog.makeSound(); // Output: "Woof!"
```

### super keyword   

In Java, the super keyword is used to refer to the parent class instance variables and methods. It is often used in inheritance to access the properties of the superclass from a subclass.

some common uses of the super keyword in Java:

1- Accessing the superclass constructor: In the subclass constructor, you can use the super keyword to call the constructor of the parent class.

```java
public class Parent {
    public Parent(int x) {
        // constructor logic
    }
}

public class Child extends Parent {
    public Child(int x, int y) {
        super(x); // call the constructor of the Parent class with the 'x' parameter
        // constructor logic
    }
}

```

2- Accessing the superclass method: In the subclass method, you can use the super keyword to call the method of the parent class.

```java
public class Parent {
    public void print() {
        System.out.println("Hello from Parent class");
    }
}

public class Child extends Parent {
    public void print() {
        super.print(); // call the 'print' method of the Parent class
        System.out.println("Hello from Child class");
    }
}


```

3- Accessing the superclass instance variables: In the subclass, you can use the super keyword to access the instance variables of the parent class.

```java
public class Parent {
    protected int x = 5;
}

public class Child extends Parent {
    public void print() {
        System.out.println(super.x); // access the 'x' variable of the Parent class
    }
}

```