package SoheylSayyah.Practice5;

import java.util.Scanner;

public class TwentyEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Width : ");
        double width = scanner.nextDouble();
        System.out.println("Please Enter Your Height : ");
        double height = scanner.nextDouble();
        System.out.println("Please Enter Your Area Per Bucket : ");
        double areaPerBucket = scanner.nextDouble();
        System.out.println("Please Enter Your Extra Bucket : ");
        int extraBucket = scanner.nextInt();
        System.out.println("Please Enter Your Area : ");
        double area = scanner.nextDouble();
        System.out.println(getBucketCount(width,height,areaPerBucket,extraBucket));
        System.out.println(getBucketCount(width,height,areaPerBucket));
        System.out.println(getBucketCount(area,areaPerBucket));
    }
    public static int getBucketCount(double width,double height,double areaPerBucket,int extraBucket){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBucket < 0){
            return -1;
        }else {
            return (int) Math.round(((width * height) - (extraBucket * areaPerBucket)) / areaPerBucket);
        }
    }
    public static int getBucketCount(double width,double height,double areaPerBucket){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }else {
            return (int) Math.round((width * height) / areaPerBucket);
        }
    }
    public static int getBucketCount(double area,double areaPerBucket){
        if (area <= 0 || areaPerBucket <= 0){
            return -1;
        }else {
            return (int) Math.ceil(area / areaPerBucket);
        }
    }
}
