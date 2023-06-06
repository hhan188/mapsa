package tamrin41;

import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements :");
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        Integer []arrays=new Integer[n];
        System.out.println("Enter the elements of the array :");

        for(int i=0; i<n; i++){
            arrays[i]=sc.nextInt();
        }
        int temp=0;
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arrays[i]>arrays[j]){
                    temp=arrays[i];
                    arrays[i]=arrays[j];
                    arrays[j]=temp;
                }
            }
        }
        for (int i=0;i<n;i++){
            System.out.println(arrays[i]+"");}
    }
}
