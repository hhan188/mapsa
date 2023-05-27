package practices.practice15.exercise07;

import static practices.practice15.exercise07.Operation.*;
import static practices.practice15.exercise07.Utils.operation;

public class Main {
    public static void main(String[] args) {

        System.out.println(operation("1","2",add));
        System.out.println(operation("4","5",subtract));
        System.out.println(operation("d","3",divide));
        System.out.println(operation("6","3",divide));


    }
}
