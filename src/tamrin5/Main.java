package tamrin5;

public class Main {
    public static void main(String[] args) {

        //NumberInWord
        System.out.print("printNumberInWord(5) -> ");
        NumberInWord.printNumberInWord(5);
        System.out.print("printNumberInWord(-5) -> ");
        NumberInWord.printNumberInWord(-5);

        //NumberOfDaysInMonth
        System.out.println("getDaysInMonth(1, 2020) -> " + NumberOfDaysInMonth.getDaysInMonth(1, 2020));
        System.out.println("getDaysInMonth(2, 2020) -> " + NumberOfDaysInMonth.getDaysInMonth(2, 2020));
        System.out.println("getDaysInMonth(2, 2018) -> " + NumberOfDaysInMonth.getDaysInMonth(2, 2018));
        System.out.println("getDaysInMonth(-1, 2020) -> " + NumberOfDaysInMonth.getDaysInMonth(-1, 2020));
        System.out.println("getDaysInMonth(1, -2020) -> " + NumberOfDaysInMonth.getDaysInMonth(1, -2020));

        //SumOddRange
        System.out.println("sumOdd(1, 100) -> " + SumOddRange.sumOdd(1, 100));
        System.out.println("sumOdd(-1, 100) -> " + SumOddRange.sumOdd(-1, 100));
        System.out.println("sumOdd(100, 100) -> " + SumOddRange.sumOdd(100, 100));
        System.out.println("sumOdd(13, 13) -> " + SumOddRange.sumOdd(13, 13));
        System.out.println("sumOdd(100, -100) -> " + SumOddRange.sumOdd(100, -100));
        System.out.println("sumOdd(100, 1000) -> " + SumOddRange.sumOdd(100, 1000));

        //NumberPalindrome
        System.out.println("isPalindrome(-1221) -> " + NumberPalindrome.isPalindrome(-1221));
        System.out.println("isPalindrome(707) -> " + NumberPalindrome.isPalindrome(707));
        System.out.println("isPalindrome(11212) -> " + NumberPalindrome.isPalindrome(11212));

        //FirstLastDigitSum
        System.out.println("sumFirstAndLastDigit(252) -> " + FirstLastDigitSum.sumFirstAndLastDigit(252));
        System.out.println("sumFirstAndLastDigit(257) -> " + FirstLastDigitSum.sumFirstAndLastDigit(257));
        System.out.println("sumFirstAndLastDigit(0) -> " + FirstLastDigitSum.sumFirstAndLastDigit(0));
        System.out.println("sumFirstAndLastDigit(5) -> " + FirstLastDigitSum.sumFirstAndLastDigit(5));
        System.out.println("sumFirstAndLastDigit(-10) -> " + FirstLastDigitSum.sumFirstAndLastDigit(-10));

        //EvenDigitSum
        System.out.println("getEvenDigitSum(123456789) -> " + EvenDigitSum.getEvenDigitSum(123456789));
        System.out.println("getEvenDigitSum(252) -> " + EvenDigitSum.getEvenDigitSum(252));
        System.out.println("getEvenDigitSum(-22) -> " + EvenDigitSum.getEvenDigitSum(-22));

        //SharedDigit
        System.out.println("hasSharedDigit(12, 23) -> " + SharedDigit.hasSharedDigit(12, 23));
        System.out.println("hasSharedDigit(9, 99) -> " + SharedDigit.hasSharedDigit(9, 99));
        System.out.println("hasSharedDigit(15, 55) -> " + SharedDigit.hasSharedDigit(15, 55));
        System.out.println("hasSharedDigit(14, 48) -> " + SharedDigit.hasSharedDigit(14,48));

        //LastDigitChecker
        System.out.println("hasSameLastDigit (41, 22, 71) ->" + LastDigitChecker.hasSameLastDigit (41, 22, 71));
        System.out.println("hasSameLastDigit (23, 32, 42) -> " + LastDigitChecker.hasSameLastDigit (23, 32, 42));
        System.out.println("hasSameLastDigit (9, 99, 999) -> " + LastDigitChecker.hasSameLastDigit (9, 99, 999));
        System.out.println("hasSameLastDigit (23, 45, 67) -> " + LastDigitChecker.hasSameLastDigit (23, 45, 67));

        //GreatestCommonDivisor
        System.out.println("getGreatestCommonDivisor(25, 15) -> " + GreatestCommonDivisor.getGreatestCommonDivisor(25, 15));
        System.out.println("getGreatestCommonDivisor(12, 30) -> " + GreatestCommonDivisor.getGreatestCommonDivisor(12, 30));
        System.out.println("getGreatestCommonDivisor(9, 18) -> " + GreatestCommonDivisor.getGreatestCommonDivisor(9, 18));
        System.out.println("getGreatestCommonDivisor(81, 153) -> " + GreatestCommonDivisor.getGreatestCommonDivisor(81, 153));

        //FactorPrinter
        System.out.println("printFactors(6)");
        FactorPrinter.printFactors(6);
        System.out.println("printFactors(32)");
        FactorPrinter.printFactors(32);
        System.out.println("printFactors(10)");
        FactorPrinter.printFactors(10);
        System.out.println("printFactors(-1)");
        FactorPrinter.printFactors(-1);

        //PerfectNumber
        System.out.println("isPerfectNumber(6) -> " + PerfectNumber.isPerfectNumber(6));
        System.out.println("isPerfectNumber(28) -> " + PerfectNumber.isPerfectNumber(28));
        System.out.println("isPerfectNumber(5) -> " + PerfectNumber.isPerfectNumber(5));
        System.out.println("isPerfectNumber(-1) -> " + PerfectNumber.isPerfectNumber(-1));

        //NumberToWords
        System.out.println(NumberToWords.getDigitCount(0));
        System.out.println(NumberToWords.getDigitCount(123));
        System.out.println(NumberToWords.getDigitCount(-12));
        System.out.println(NumberToWords.getDigitCount(5200));
        System.out.println(NumberToWords.reverse(-121));
        System.out.println(NumberToWords.reverse(1212));
        System.out.println(NumberToWords.reverse(1234));
        System.out.println(NumberToWords.reverse(100));
        NumberToWords.numberToWords(123);
        NumberToWords.numberToWords(1010);
        NumberToWords.numberToWords(1000);
        NumberToWords.numberToWords(-12);

        //FlourPacker
        System.out.println(FlourPacker.canPack(1, 0, 4));
        System.out.println(FlourPacker.canPack(1, 0, 5));
        System.out.println(FlourPacker.canPack(0, 5, 4));
        System.out.println(FlourPacker.canPack(2, 2, 11));
        System.out.println(FlourPacker.canPack(-3, 2, 12));

        //LargestPrime
        System.out.println(LargestPrime.getLargestPrime(21));
        System.out.println(LargestPrime.getLargestPrime(217));
        System.out.println(LargestPrime.getLargestPrime(0));
        System.out.println(LargestPrime.getLargestPrime(45));
        System.out.println(LargestPrime.getLargestPrime(-1));

        //DiagonalStar
        DiagonalStar.printSquareStar(5);
        DiagonalStar.printSquareStar(8);
        DiagonalStar.printSquareStar(15);

        //InputCalculator
        InputCalculator.inputThenPrintSumAndAverage();

        //PaintJob
        System.out.println(PaintJob.getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(PaintJob.getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println(PaintJob.getBucketCount(-3.4, 2.1, 1.5 ));
        System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5 ));
        System.out.println(PaintJob.getBucketCount(7.25, 4.3, 2.35 ));
        System.out.println(PaintJob.getBucketCount(3.4, 1.5));
        System.out.println(PaintJob.getBucketCount(6.26, 2.2));
        System.out.println(PaintJob.getBucketCount(3.26, 0.75));
    }
}