package tamrin6.P11;

import tamrin6.P4.Car;

public class UsingMashin {
        public static void main(String[] args) {
            Mashin car1 = new Mashin("Toyota", "Corolla", 2021);
            Mashin car2 = new Mashin("Toyota", "Corolla", 2010);

            System.out.println("The Result of Comparing Cars models and year is: ");
            System.out.println(car1.isSameMashin(car2));
            // or sout car2.isSameMashin(car1));
        }
    }

