package tamrin9.generics.p3;

import tamrin9.generics.House;

public class Main {
    public static void main(String[] args) {


        House h1 = new House("001", 115.3F);
        House h2 = new House("002", 105.1F);
        House h3 = new House("003", 75.6F);
        House h4 = new House("004", 220);
        House h5 = new House("005", 63.5F);
        House h6 = new House("006", 55.5F);

        House[] houses = new House[]{h1,h2,h3,h4,h5};

        System.out.println("Contains.contains(houses, h3):" + Contains.contains(houses, h3));
        System.out.println("Contains.contains(houses, h6):" + Contains.contains(houses, h6));

    }
}
