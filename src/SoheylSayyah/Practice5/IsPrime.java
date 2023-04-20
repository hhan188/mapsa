package SoheylSayyah.Practice5;

public class IsPrime {
    public static void main(String[] args) {
            int i = 0;
            int j = 0;
            StringBuilder primeNumbers = new StringBuilder();
            for (i = 0 ; i < 100 ; i++){
                int counter = 0;
                for (j = i ; j >= 1 ; j--){
                    if (i % j == 0){
                        counter += 1;
                    }
                }
                if (counter == 2){
                    primeNumbers.append(i).append(" ");
                }
            }
            System.out.println("All Prime Numbers Between 1 to 100 Are : " + primeNumbers);
        }
    }