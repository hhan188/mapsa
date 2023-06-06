package Practice11.tamrine5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
//benevis nokatesho to checknevis
public class Student {
    public static void main(String[] args) throws GradeOutOfRange {//umade array list sakhte ye arraylist ro be onvan voroodi be method dade
        List<Integer> num = new ArrayList<>();
        num.add(12);
        num.add(10);
        num.add(199);
        System.out.println(avarage(num));
    }

    public static int avarage(List<Integer> number) {
        int sum = 0;
        int count = 0;
        try {
            for (int numbers : number) {
                if (numbers < 0 || numbers > 100) {
                    throw new GradeOutOfRange("grade out of Range");
                }
                sum += numbers;
                count++;
            }
            return sum / count;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return sum/count;//hatman bayad ye return i dashte bashe vagarne error mide
        }
    }

    }
    //-----------------------------------------
    //rah hal khodam ke faghatt 5 ta adad mitoonestim behesh bedim
//        Scanner scanner=new Scanner(System.in);
//        int sum=0;
//        int counter=0;
//        while(counter<5){
//            try {
//                System.out.println("please enter the grade : ");
//                int grade = scanner.nextInt();
//                if (grade >= 0 && grade <= 100) {
//                    sum += grade;
//                    counter += 1;
//                } else {
//                    throw new GradeOutOfRange("wrong grade !");
//
//                }
//                 } catch(GradeOutOfRange e){
//                    System.out.println(e.getMessage());
//                }
//            catch (Exception e){
//                System.out.println("Exception!!");
//                break;
//            }
//            }
//        System.out.println("The average is :"+ sum/counter);
//
//    }





