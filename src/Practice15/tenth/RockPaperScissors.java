package Practice15.tenth;

public class RockPaperScissors {
    public static void main(String[] args) {
        method("rock","paper");
        method("scissors","rock");

    }
    public static void method(String firstInput,String secondInput){
        if(firstInput.equals(secondInput)){
            System.out.println("TIE");
        }
         else if(firstInput.equalsIgnoreCase("rock")&& secondInput.equalsIgnoreCase("scissors")){
            System.out.println("Player 1 wins.");
        }
        else if(firstInput.equalsIgnoreCase("rock")&& secondInput.equalsIgnoreCase("paper")){
            System.out.println("Player 2 wins.");
        }
        else if(firstInput.equalsIgnoreCase("paper")&& secondInput.equalsIgnoreCase("rock")){
            System.out.println("Player 1 wins.");
        }
        else if(firstInput.equalsIgnoreCase("paper")&& secondInput.equalsIgnoreCase("scissors")){
            System.out.println("Player 2 wins.");
        }
        else if(firstInput.equalsIgnoreCase("scissors")&& secondInput.equalsIgnoreCase("rock")){
            System.out.println("Player 2 wins.");
        }
        else if(firstInput.equalsIgnoreCase("scissors")&& secondInput.equalsIgnoreCase("paper")){
            System.out.println("Player 1 wins.");
        }





    }
}
