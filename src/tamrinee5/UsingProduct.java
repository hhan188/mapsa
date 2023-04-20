package tamrinee5;

    public class UsingProduct {
        public static void main(String[] args){
            Product[] products=new Product[3];
            products[0]=new Product("silver",12_000);
            products[1]=new Product("gold",20_0000);
            products[2]=new Product("diamond",27_000);
            System.out.println(lowestPrice(products));
        }
        public static String lowestPrice(Product[] products){
            String name=products[0].getName();
            int lowestPrice=products[0].getPrice();
            for (int i=0;i<3;i++){
                if(lowestPrice>products[i].getPrice()){
                    lowestPrice=products[i].getPrice();
                    name=products[i].getName();
                }
            }
            return name;
        }
    }
