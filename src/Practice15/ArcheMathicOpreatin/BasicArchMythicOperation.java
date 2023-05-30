package Practice15.ArcheMathicOpreatin;

public class BasicArchMythicOperation {
    public static void main(String[] args) {
   String firstNumber = "4";
   String secondNumber = "5";
   String operation = "sub";
   operations(firstNumber, secondNumber, operation);
    }

    public static void operations(String firstNumber, String secondNumber, String operation) {
        switch (operation) {
            case "mul":
                System.out.println(Integer.parseInt(firstNumber) * Integer.parseInt(secondNumber));
                break;
            case "add":
                System.out.println(Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber));
                break;
            case "sub":
                System.out.println(Integer.parseInt(firstNumber) - Integer.parseInt(secondNumber));
                break;
            case "divide":
                System.out.println(Integer.parseInt(firstNumber) / Integer.parseInt(secondNumber));
                break;

        }

    }
}

