package tamrin5;
    public class Main
    {
        public static void main(String[] args)
        {
            Practice5 p5 = new Practice5();

            System.out.println("Tamrin 12");
            System.out.println(p5.printNumberInWord(5));
            System.out.println("-----------------------------------");

            System.out.println("Tamrin 13");
            System.out.println(p5.isLeapYear(1700));
            System.out.println("-----------------------------------");

            System.out.println("Tamrin 14");
            System.out.println(p5.isOdd(9));
            System.out.println("-----------------------------------");

            System.out.println("Tamrin 15");
            System.out.println(p5.isPalindrome(363));
            System.out.println("-----------------------------------");

            System.out.println("Tamrin 16");
            System.out.println(p5.sumFirstAndLastDigits(345));
            System.out.println("-----------------------------------");

            System.out.println("Tamrin 17");
            System.out.println(p5.getEvenDigitSum(3548));
            System.out.println("-----------------------------------");

            System.out.println("Tamrin 18");
            System.out.println(p5.hasSharedDigit(123, 324));
            System.out.println("-----------------------------------");

            System.out.println("Tamrin 19");
            System.out.println(p5.hasSameLastDigit(347, 897, 117));
            System.out.println("-----------------------------------");

            System.out.println("Tamrin 20");
            System.out.println(p5.getGreatestCommonDivisor(81, 153));
            System.out.println("-----------------------------------");

            System.out.println("Tamrin 21");
            p5.printFactor(32);
            System.out.println("-----------------------------------");

            System.out.println("Tamrin 22");
            System.out.println(p5.isPerfect(54));
            System.out.println("-----------------------------------");

            System.out.println("Tamrin 23");
            System.out.println(p5.reverse(345));
            System.out.println("-----------------------------------");

            System.out.println("Tamrin 24");
            System.out.println(p5.canPack(1, 6, 9));
            System.out.println("-----------------------------------");

            System.out.println("Tamrin 25");
            System.out.println(p5.getLargestPrime(45));
            System.out.println("-----------------------------------");

            System.out.println("Tamrin 26");
            p5.printSquareStar(8);
            System.out.println("-----------------------------------");

            System.out.println("Tamrin 27");
            p5.inputThenPrintSumAndAverage();
            System.out.println("-----------------------------------");

            System.out.println("Tamrin 28");
            System.out.println(p5.getBucketCount(2.75, 3.25, 2.5, 1));
            System.out.println(p5.getBucketCount(3.4, 2.1, 1.5));
            System.out.println(p5.getBucketCount(3.26, 0.75));
            System.out.println("-----------------------------------");
        }
    }
