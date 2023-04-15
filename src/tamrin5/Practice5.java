package tamrin5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice5
{
        //-----------------------------------------------------------------------
        //Tamrin 12

        public String printNumberInWord(int number)
        {
            String [] digits = {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};

            String result = "";

            if (number < -10)       //If Number is Less Than -10
            {
                for (int i=0; i< digits.length; i++)
                {
                    result += "Minus " + digits[i];
                    if (i == digits.length)
                    {
                        break;
                    }
                    result += ", ";
                }
                result += "OTHER";
            }
            else if (number < 0 && number > -10)      //if number is Less Than 0 And Greater Than -10
            {
                for (int i=0; i<= -(number); i++)
                {
                    result += "Minus " + digits [i];

                    if (i == -(number))
                    {
                        break;
                    }
                    result += ", ";
                }
            }
            else if ( number >= 0 && number < 10)    //if number is between 0 and 10
            {
                for (int i=0; i<=number; i++)
                {
                    result += digits[i];
                    if (i == number)
                    {
                        break;
                    }
                    result += ", ";
                }
            }
            else if (number >= 10)       //if number is Greater than 10
            {
                for (int i=0; i< digits.length; i++)
                {
                    result += digits[i];
                    if (i == digits.length)
                    {
                        break;
                    }
                    result += ", ";
                }
                result += "OTHER";
            }

            return result;
        }


        //-----------------------------------------------------------------------
        //Tamrin 13

        public boolean isLeapYear (int year)
        {
            if (year >= 1 && year <= 9999)
            {
                if (year % 400 == 0)
                {
                    return true;
                }

                if (year % 100 == 0)
                {
                    return false;
                }
                if (year % 4 == 0)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }

            return false;
        }

        public int getDaysInMonth (int month, int year)
        {
            if (month < 1 || month > 12)
            {
                return -1;
            }
            else if (year < 1 || year > 9999)
            {
                return -1;
            }
            else
            {
                if (month == 2 && isLeapYear(year))
                {
                    return 29;
                }
                else if (month == 2 && !isLeapYear(year))
                {
                    return 28;
                }
                else
                {
                    return 31;
                }
            }
        }


        //-----------------------------------------------------------------------
        //Tamrin 14

        public boolean isOdd (int num)  //Checking if Number is Odd
        {
            if (num > 0)
            {
                if (num % 2 != 0)
                {
                    return true;
                }
            }
            return false;
        }

        public int sumOdd (int start, int end)
        {
            int result = 0;

            if (start < 0 || end < 0)
            {
                return -1;
            }
            if (end < start)
            {
                return -1;
            }

            for (int i = start; i <= end; i++)
            {
                if (isOdd(i))
                {
                    result += i;
                }
            }
            return result;
        }


        //-----------------------------------------------------------------------
        //Tamrin 15
        public boolean isPalindrome (int number)
        {
            int reverse = 0;
            int lastDigit = 0;

            if (number < 0)
            {
                number = -(number);
            }

            int originalNumber = number;

            while (number > 0)
            {
                lastDigit= number % 10;
                reverse *= 10;
                reverse += lastDigit;
                number /= 10;
            }

            if (originalNumber == reverse)
            {
                return true;
            }
            return false;
        }


        //-----------------------------------------------------------------------
        //Tamrin 16
        public int sumFirstAndLastDigits (int number)
        {
            if (number < 0)
            {
                return -1;
            }
            int originalNumber = number;
            int howManyDigits = 0;
            int digitsForDivide = 1;
            int firstDigit = 0;
            int lastDigit = 0;
            int sum = 0;

            while (number > 0)      //calculates how many digits the number have
            {
                howManyDigits++;
                number /= 10;
            }

            for (int i=1; i< howManyDigits; i++)
            {
                digitsForDivide *= 10;
            }

            firstDigit = originalNumber / digitsForDivide;
            lastDigit = originalNumber % 10;


            sum = firstDigit + lastDigit;

            return sum;
        }


        //-----------------------------------------------------------------------
        //Tamrin 17
        public int getEvenDigitSum (int number)
        {
            int sum = 0;
            int temp;
            if (number < 0)
            {
                return -1;
            }

            while (number > 0)
            {
                temp = number % 10;
                if (temp % 2 == 0)
                {
                    sum += temp;
                }
                number /= 10;
            }
            return sum;
        }


        //-----------------------------------------------------------------------
        //Tamrin 18
        public boolean hasSharedDigit (int firstNumber, int secondNumber)
        {
            if ((firstNumber >= 10 && firstNumber <= 99) && (secondNumber >= 10 && secondNumber <= 99))
            {
                //Split First Number Digits
                int firstNumberFirstDigit = firstNumber % 10;
                int firstNumberSecondDigit = firstNumber / 10;

                //Split Second Number Digits
                int secondNumberFirstDigit = secondNumber % 10;
                int secondNumberSecondDigit = secondNumber / 10;

                if (firstNumberFirstDigit == secondNumberFirstDigit)
                {
                    return true;
                }
                else if (firstNumberSecondDigit == secondNumberSecondDigit)
                {
                    return true;
                }
                else if (firstNumberFirstDigit == secondNumberSecondDigit)
                {
                    return true;
                }
                else if (firstNumberSecondDigit == secondNumberFirstDigit)
                {
                    return true;
                }
            }
            return false;
        }


        //-----------------------------------------------------------------------
        //Tamrin 19
        public boolean hasSameLastDigit (int first, int second, int third)
        {
            if (isValid(first) && isValid(second) && isValid(third))
            {
                //Last Digit of First Number
                int firstNumberLastDigit = first % 10;

                //Last Digit of Second Number
                int secondNumberLastDigit = second % 10;

                //Last Digit of Third Number
                int thirdNumberLastDigit = third % 10;

                if (firstNumberLastDigit == secondNumberLastDigit)
                {
                    return true;
                }
                else if (firstNumberLastDigit == thirdNumberLastDigit)
                {
                    return true;
                }
                else if (secondNumberLastDigit == thirdNumberLastDigit)
                {
                    return true;
                }
            }
            return false;
        }

        public boolean isValid (int num)
        {
            if (num >= 10 && num <= 1000)
            {
                return true;
            }
            return false;
        }

        //-----------------------------------------------------------------------
        //Tamrin 20
        public int getGreatestCommonDivisor (int first, int second)
        {
            ArrayList<Integer> firstArr = new ArrayList<Integer>();
            ArrayList <Integer> secondArr = new ArrayList<Integer>();
            ArrayList <Integer> result = new ArrayList<Integer>();

            if (first < 10 || second < 10)
            {
                return -1;
            }

            int firstCounter = 1;
            for (int i=0; i < (first/2); i++)
            {
                if(first % firstCounter == 0)
                    firstArr.add(first/firstCounter);
                firstCounter++;
            }
            firstArr.remove(0);     //remove's first element because the first element is entered number

            int secondCounter = 1;
            for (int i=0; i < (second/2); i++)
            {
                if(second % secondCounter == 0)
                    secondArr.add(second/secondCounter);
                secondCounter++;
            }
            secondArr.remove(0);        //remove's second element because the second element is entered number

            for (int i=0; i<firstArr.size(); i++)
            {
                for (int j=0; j<secondArr.size(); j++)
                {
                    if (firstArr.get(i).equals(secondArr.get(j)))
                    {
                        result.add(firstArr.get(i));
                    }
                }
            }
            if (result.size() == 0)
                return 0;

            return result.get(0);
        }

        //-----------------------------------------------------------------------
        //Tamrin 21
        public void printFactor (int number)
        {
            ArrayList<Integer> factors = new ArrayList<Integer>();

            if (number < 1)
            {
                System.out.println("Invalid Value");
            }

            int firstCounter = 1;
            for (int i=0; i < (number/2); i++)      //Finds Divisors
            {

                if(number % firstCounter == 0)
                    factors.add(number/firstCounter);
                firstCounter++;
            }

            int j=factors.size();
            factors.add(1);


            while (j >= 0)      //Printing Elements
            {
                System.out.println(factors.get(j));
                j--;
            }
        }

        //-----------------------------------------------------------------------
        //Tamrin 22
        public boolean isPerfect (int number)
        {
            ArrayList<Integer> divisors = new ArrayList<Integer>();

            if (number < 0)
            {
                return false;
            }

            int firstCounter = 1;
            for (int i=0; i < (number/2); i++)      //Finding Divisors
            {

                if(number % firstCounter == 0)
                    divisors.add(number/firstCounter);
                firstCounter++;
            }

            int j = 1;
            divisors.add(1);
            int sumOfDivisors = 0;
            while (j < divisors.size())     // Sum All Divisors
            {
                sumOfDivisors += divisors.get(j);
                j++;
            }

            if (sumOfDivisors == number)        //Checks Sum Of Divisors is Equal with Number;
            {
                return true;
            }

            return false;
        }

        //-----------------------------------------------------------------------
        //Tamrin 23
        public int reverse (int number)
        {
            int reversedNumber = 0;
            if (number < 0)
            {
                return (reverse(-(number))) * (-1);     //Sends The Correlation of Number to Own Method and Multiples --
            }                                           //-- Returned Value By -1 for Keeping the Minus of Number

            while (number > 0)
            {
                reversedNumber *= 10;
                reversedNumber += (number % 10);
                number /= 10;
            }
            return reversedNumber;
        }

        public int getDigitCounts (int number)
        {
            if (number < 0)
            {
                return -1;
            }

            int counter = 0;

            while (number > 0)
            {
                number /= 10;
                counter++;          //Counts The Number Digits
            }
            return counter;
        }

        //-----------------------------------------------------------------------
        //Tamrin 24
        public boolean canPack (int bigCount, int smallCount, int goal)
        {
            final int bigBag = 5;
            final int smallBag = 1;
            int bigBagSum;
            int smallBagSum;

            if (bigCount >= 0 && smallCount >= 0 && goal >= 0)
            {
                bigBagSum = goal / bigBag;
                smallBagSum = smallBag * smallCount ;

                if ((bigBagSum * bigBag) + smallBagSum >= goal)
                {
                    return true;
                }
            }
            return false;
        }

        //-----------------------------------------------------------------------
        //Tamrin 25
        public int getLargestPrime (int number)
        {
            ArrayList <Integer> divisors = new ArrayList<Integer>();
            ArrayList <Integer> primeNumbers = new ArrayList<Integer>();

            if (number <= 0)
            {
                return -1;
            }
            else
            {
                for (int i = 3; i < number / 2; i++)
                {
                    if (number % i == 0) {
                        divisors.add(i);
                    }
                }

                for (Integer divisor : divisors)
                {
                    if (isPrime(divisor))
                    {
                        primeNumbers.add(divisor);
                    }
                }
            }

            return primeNumbers.get(primeNumbers.size()-1);
        }

        public boolean isPrime (int number)
        {
            if (number % 2 == 0)
            {
                return false;
            }
            int counter = 0;

            for (int i=3; i < number/2; i++)
            {
                if (number % i == 0)
                {
                    counter++;
                }
            }

            if(counter > 0)
            {
                return false;
            }
            return true;
        }


        //-----------------------------------------------------------------------
        //Tamrin 26
        public void printSquareStar (int number)
        {
            if (number > 5)
            {
                for (int i=0; i<number; i++)
                {
                    for (int j=0; j<number; j++)
                    {
                        if (i == 0 || j == 0 || i == j
                                || i == number - 1 || j == number - 1
                                || i + j == number - 1)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
            }
        }

        //-----------------------------------------------------------------------
        //Tamrin 27
        public void inputThenPrintSumAndAverage () {

            ArrayList<Integer> num = new ArrayList<>();
            int sum = 0;
            long avg = 0;

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Numbers: ");

            try {
                while (true)
                {
                    num.add(sc.nextInt());
                }
            } catch (InputMismatchException e)
            {
                if (num.size() == 0)
                {
                    System.out.println("SUM = " + sum + " AVG = " + avg);
                }
                else
                {
                    for (int i = 0; i < num.size(); i++)
                    {
                        sum += num.get(i);
                    }
                    avg = sum / (num.size());

                    System.out.println("SUM = " + sum + " AVG = " + Math.round(avg));
                }
            }
        }

        //-----------------------------------------------------------------------
        //Tamrin 28
        public int getBucketCount (double width, double height, double areaPerBucket, int extraBucket)
        {
            double area;
            double buckets;
            if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBucket < 0)
            {
                return -1;
            }
            else
            {
                area = width * height;
                buckets = areaPerBucket * extraBucket;
            }

            double totalBucket = ((area - buckets)/areaPerBucket);
            double result = Math.ceil(totalBucket);

            return (int) result;
        }

        public int getBucketCount (double width, double height, double areaPerBucket)
        {
            double area;
            if (width <= 0 || height <= 0 || areaPerBucket <= 0)
            {
                return -1;
            }
            else
            {
                area = width * height;
            }

            double totalBuckets = (area/areaPerBucket);
            double result = Math.ceil(totalBuckets);

            return (int) result;
        }

        public int getBucketCount (double area, double areaPerBucket)
        {

            if (area <= 0 || areaPerBucket <= 0)
            {
                return -1;
            }

            double totalBuckets = (area/areaPerBucket);

            double result = Math.ceil(totalBuckets);

            return (int) result;
        }

    }
