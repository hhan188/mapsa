package Tamrin11;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public static void main(String[] args) throws gradeOutOfRangeException {
        List<Integer> num = new ArrayList<>();
        num.add(12);
        num.add(10);
        num.add(103);
        System.out.println(avarage(num));
    }

    public static int avarage(List<Integer> number) {
        int sum = 0;
        int count = 0;
        try {
            for (int numbers : number) {
                if (numbers < 0 || numbers > 100) {
                    throw new gradeOutOfRangeException("gradeoutofRange");
                }
                sum = sum + numbers;
                count++;
            }
            return sum / count;
        } catch (Exception e) {
          e.printStackTrace();
            return sum/count;
        }
    }
}
