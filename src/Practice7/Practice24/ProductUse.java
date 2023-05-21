package Practice7.Practice24;

public class ProductUse {
    public static void main(String[] args) {
        Product[] products=new Product[3];
        products[0]=new Product("x",12);
        products[1]=new Product("y",20);
        products[2]=new Product("z",30);
        System.out.println(lowestPrice(products));
    }
    public static String lowestPrice(Product[] products){
        int min=100;
        String name="";
        for (Product item:products) {
            if (item.getPrice() < min){
                min=item.getPrice();
                name=item.getName();

            }else {
                item.getPrice();
            }
        }

        return name;
    }
}
