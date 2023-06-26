package com.Practice17;


public class Main
{
    public static void main(String[] args)
    {

        System.out.println("\nQuestion 1: (All Products Greater Than 50$)");
        System.out.println("--------------------------------------------------");
        Product.printPricesGreaterThan();
        System.out.println("--------------------------------------------------\n");

        System.out.println("Question 2: (Total Price of All Products In Warehouse A)");
        System.out.println("--------------------------------------------------");
        Warehouse.printAllPricesInWarehouseA();
        System.out.println("--------------------------------------------------\n");


        System.out.println("Question 3: (Average Price of All Electronics Products)");
        System.out.println("--------------------------------------------------");
        Warehouse.avgPriceOfAllElectronicsProducts();
        System.out.println("--------------------------------------------------\n");


        System.out.println("Question 4: (Sort the Products by Their Names in Ascending Order)");
        System.out.println("--------------------------------------------------");
        Product.sortAllProducts();
        System.out.println("--------------------------------------------------\n");


        System.out.println("Question 5: (Check If Any Product Is Out Of Stock)");
        System.out.println("--------------------------------------------------");
        Product.outOfStock();
        System.out.println("--------------------------------------------------\n");


        System.out.println("Question 6: (Name of Products In Warehouse B)");
        System.out.println("--------------------------------------------------");
        Warehouse.nameOfProductsInWarehouseB();
        System.out.println("--------------------------------------------------\n");


        System.out.println("Question 7: (Expensive Product in Each Warehouse)");
        System.out.println("--------------------------------------------------");
        Warehouse.expensiveProducts();
        System.out.println("--------------------------------------------------\n");


        System.out.println("Question 8: (Any Warehouse Has More Than 10 Products)");
        System.out.println("--------------------------------------------------");
        Warehouse.hasMoreThanTenProduct();
        System.out.println("--------------------------------------------------\n");


        System.out.println("Question 9: (Group Products by Their Categories)");
        System.out.println("--------------------------------------------------");
        Product.groupingProducts();
        System.out.println("--------------------------------------------------\n");


        System.out.println("Question 10: (Cheapest Product in The Electronics)");
        System.out.println("--------------------------------------------------");
        Product.cheapestProductInElectronic();
        System.out.println("--------------------------------------------------\n");


        System.out.println("Question 11: (All In Stock Products Average)");
        System.out.println("--------------------------------------------------");
        Product.inStockPriceAvg();
        System.out.println("--------------------------------------------------\n");


        System.out.println("Question 12: (Warehouse With The Highest-Priced Product)");
        System.out.println("--------------------------------------------------");
        Warehouse.highestPricedWarehouse();
        System.out.println("--------------------------------------------------\n");


        System.out.println("Question 13: (All Warehouses Have at least One Product in Stock)");
        System.out.println("--------------------------------------------------");
        Warehouse.haveInStock();
        System.out.println("--------------------------------------------------\n");


        System.out.println("Question 14: (Products With Names Containing The Letter 'a')");
        System.out.println("--------------------------------------------------");
        Product.containingA();
        System.out.println("--------------------------------------------------\n");


        System.out.println("Question 15:");
        System.out.println("--------------------------------------------------");
        Warehouse.numberOFProductsInWarehouses();
        System.out.println("--------------------------------------------------\n");


        System.out.println("Question 16:");
        System.out.println("--------------------------------------------------");
        Warehouse.largestWarehouse();
        System.out.println("--------------------------------------------------\n");


        System.out.println("Question 17:");
        System.out.println("--------------------------------------------------");
        Warehouse.hasOnlyOneProduct();
        System.out.println("--------------------------------------------------\n");



        System.out.println("Question 18:");
        System.out.println("--------------------------------------------------");
        Warehouse.lowestPriceProductInWarehouseA();
        System.out.println("--------------------------------------------------\n");



        System.out.println("Question 19:");
        System.out.println("--------------------------------------------------");
        Product.sortByPriceInDescending();
        System.out.println("--------------------------------------------------\n");



        System.out.println("Question 20:");
        System.out.println("--------------------------------------------------");
        Product.nameOfAllInStockProducts();
        System.out.println("--------------------------------------------------\n");

    }
}
