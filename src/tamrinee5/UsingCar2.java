

import java.util.Arrays;

public class UsingCar2 {

        public static void main(String[] args){
            Car2[] cars=new Car2[4];
            cars[0]=new Car2("mg-32","Toyota");
            cars[1]=new Car2("m-11","Tesla");
            cars[2]=new Car2("fg-32","Ford");
            cars[3]=new Car2("01-ww","Toyota");
            sameMakes(cars,"Toyota");

        }
        public static void sameMakes(Car2[] cars,String make){
            String[] newArr = new String[cars.length];
            int counter = 0;
            for (int i = 0; i < cars.length; i++) {
                if (cars[i].getMake().equals(make)) {
                    newArr[counter] = cars[i].getName();
                    counter++;
                }
            }

            System.out.println(Arrays.toString(newArr));
        }
}
