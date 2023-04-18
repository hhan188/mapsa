## Arrays 

-----------------------------------------
An array in Java is a collection of elements of the same data type, 
stored in contiguous memory locations. 
Each element of an array can be accessed by its index or position in the array, 
which starts at 0.

To declare an array in Java,
you specify the data type of the elements and the size of the array.
For example, to declare an array of integers with 5 elements, 
you would use the following syntax:

```java
int[] numbers = new int[5];
```

This creates an array named numbers that can hold 5 integers. 
To access individual elements of the array, you use the index of the element, like this:

```java
numbers[0] = 10;
numbers[1] = 20;
numbers[2] = 30;
numbers[3] = 40;
numbers[4] = 50;
```

This sets the first element of the array to 10, the second element to 20, and so on.

You can also initialize the values of the array when you declare it, like this:


```java
int[] numbers = {10, 20, 30, 40, 50};
```

This creates the same array as before, but initializes its values in one line.

Arrays can also be used as parameters to methods, 
which allows you to pass collections of data to functions. For example, here's a method that takes an array of integers and returns their sum:

```java
public static int sum(int[] arr) {
    int total = 0;
    for (int i = 0; i < arr.length; i++) {
        total += arr[i];
    }
    return total;
}
```

To call this method with an array, you would pass the array as an argument, like this:

```java
int[] numbers = {10, 20, 30, 40, 50};
int total = sum(numbers);
System.out.println(total); // Output: 150
```

This will print the sum of the values in the numbers array.