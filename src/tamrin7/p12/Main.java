package tamrin7.p12;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String inputString = "This is my sentence for solving the problem 12 that says: hello " +
                "Create an array of 30 strings and find the index of the first occurrence of the string hello";
        String[] strArray = inputString.split(" ");

        System.out.println(Arrays.toString(strArray));

        for (int i = 0; i < strArray.length; i++){
            if (strArray[i].equals("hello")){
                System.out.println("The first occurrence of 'hello' is at index " + i);
                break;
            }
        }
    }
}
