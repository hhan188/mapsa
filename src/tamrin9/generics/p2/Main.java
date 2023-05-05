package tamrin9.generics.p2;

import tamrin9.generics.House;

public class Main {
    public static void main(String[] args) {

        House[] houses = new House[]{
                new House("001", 115.3F),
                new House("002", 105.1F),
                new House("003", 75.6F),
                new House("004", 220),
                new House("005", 63.5F),
        };

        System.out.println(Max.max(houses));

    }
}
