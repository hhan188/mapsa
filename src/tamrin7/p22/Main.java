package tamrin7.p22;

public class Main {
    public static void main(String[] args) {

        Car[] myCars = {new Car("Toyota", "Prius"),
                new Car("Renault", "Captur"),
                new Car("Toyota", "Corolla"),
                new Car("Renault", "Kwid"),
                new Car("Toyota", "Yaris"),
                new Car("Renault", "Duster"),
                new Car("Toyota", "Rav4"),
                new Car("Renault", "Fluence"),
                new Car("Toyota", "C-HR"),
                new Car("Renault", "Koleos"),
                new Car("Toyota", "Land Cruiser")
        };
        Car[] made1 = carsSelector(myCars, "Toyota");
        for (Car car: made1
             ) {
            System.out.println(car);
        }
        System.out.println("******************************");
        Car[] made2 = carsSelector(myCars, "Renault");
        for (Car car: made2
        ) {
            System.out.println(car);
        }
    }

    private static Car[] carsSelector(Car[] carArray, String carMake) {

        int count = 0;

        for (int i = 0; i < carArray.length; i++) {
            if (carArray[i].getMake().toString().equals(carMake.toString())) {
                count++;
            }
        }

        Car[] result = new Car[count];
        count = 0;

        for (int i = 0; i < carArray.length; i++) {
            if (carArray[i].getMake() == carMake) {
                result[count] = new Car();
                result[count].setMake(carMake);
                result[count].setModel(carArray[i].getModel());
                count++;
            }
        }
        return result;
    }
}
