import java.util.Scanner;

public class Tamrin5 {
    public static void printNumberINWord(int number) {
        //p12
        switch (number) {
            case 1:
                System.out.print("one ");
                break;
            case 2:
                System.out.print("Two ");
                break;
            case 3:
                System.out.print("Three ");
                break;
            case 4:
                System.out.print("four ");
                break;
            case 5:
                System.out.print("five ");
                break;
            case 6:
                System.out.print("six ");
                break;
            case 7:
                System.out.print("seven ");
                break;
            case 8:
                System.out.print("eight ");
                break;
            case 9:
                System.out.print("nine ");
                break;
            default:
                System.out.print("Other ");
                break;
        }
    }

    //p13
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        if (year % 4 == 0) {
            return true;
        } else return false;
    }

    //p14
    public static void sumOdd(int start, int end) {
        if (start > end || start < 0 || end < 0)
            return;
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {

                sum = sum + i;
            }

        }
        System.out.println("sum:" + sum);
    }

    //p14
    public static boolean isOdd(int number) {
        if (number % 2 != 0) {
            return true;
        } else return false;
    }

    //p15
    public static boolean isPalindorm(int number) {
        //*star Question
        char[] numbers = String.valueOf(number).toCharArray();
        for (int i = 0, j = numbers.length - 1; i < (numbers.length / 2); i++, j--) {
            if (numbers[i] != numbers[j]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        getLargestPrime(217);
    }

    //p16
    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }
        int firstDigit = 0;
        int lastDigit = 0;

        lastDigit = number % 10;
        System.out.println("Last digit: " + lastDigit);

        while (number != 0) {
            firstDigit = number % 10;
            number /= 10;
        }
        System.out.println("First digit: " + firstDigit);
        return firstDigit + lastDigit;
    }

    //p17
    public static int getEvenDigitSum(int number) {
        int sum = 0;
        while (number != 0) {
            if (isEven(number % 10)) {
                sum = sum + (number % 10);
            }
            number /= 10;
        }
        return sum;
    }

    //p17
    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else return false;
    }

    //p18
    public static boolean shareDigit(int no1, int no2) {
        if (no1 > 100 || no2 > 100 || no1 < 10 || no2 < 10)
            return false;

        if (no1 % 10 == no2 % 10 || no1 / 10 == no2 / 10 || no1 % 10 == no2 / 10 || no1 / 10 == no2 % 10)
            return true;


        return false;
    }

    //p19
    public static boolean isValid(int number) {
        if (number >= 10 && number < 1000) {
            return true;
        }
        return false;
    }

    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {
        if (!isValid(firstNumber) || !isValid(secondNumber) || !isValid(thirdNumber)) {
            return false;
        }
        return ((firstNumber % 10 == secondNumber % 10) || (firstNumber % 10 == thirdNumber % 10) || (secondNumber % 10 == thirdNumber % 10));
    }

    //p23
    public static void numberToWord(int number) {
        int count = 0;
        int pr = 0;
       // int realCount = count(number);
        number = reverse(number);
        while (number != 0) {
            count++;
            pr = number % 10;
            number /= 10;
            printNumberINWord(pr);
        }
        /*if (count != realCount) {
            int i = realCount - count;
            for (int j = 0; j <= i; j++) {
                printNumberINWord(0);
            }
        }*/
    }

    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            int re = number % 10;
            reverse = reverse * 10 + re;
            number = number / 10;
        }
        return reverse;
    }

    //p22
    public static boolean perfectNumber(int number) {
        int sum = 0;
        if (number < 0) {
            return false;
        }
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == number) {
            return true;
        }
        return false;
    }

    //p24
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        boolean result = false;
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return result;
        }
        if ((bigCount * 5) + (smallCount) >= goal) {
            result = true;
            while (goal > 0) {
                if (goal >= 5) {
                    if (bigCount >= 1) {
                        goal -= 5;
                        bigCount--;
                    } else if (smallCount >= goal) {
                        goal = 0;
                        return true;
                    } else {
                        return false;
                    }
                } else if (goal < 5) {
                    if (smallCount >= goal) {
                        goal = 0;
                        return true;
                    } else {
                        return false;
                    }
                }
            }
            return result;
        } else {
            return false;
        }

    }

    //p25
    public static int getLargestPrime(int number) {

        if (number <= 0 || number <= 1) {
            return -1;
        } else {
            int largestPrime = 2;
            while (largestPrime < number) {
                if (number % largestPrime != 0) {
                    largestPrime++;
                } else {
                    number = number / largestPrime;

                }
            }
            return number;
        }
    }

    //p26
    public static void printSqureStar(int n) {//condition 4 is wrong
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (i == 0 || j == 0 || i == j
                        || i == n - 1 || j == n - 1
                        || i + j == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    //p27
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int co = 0;
        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            sum = sum + a;
            co++;
        }
        if (co == 0) {
            System.out.println("SUM = " + sum + "AVG = " + co);
        }
        System.out.println("SUM = " + sum + "AVG = " + (sum / co));
    }
}

