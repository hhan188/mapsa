package SoheylSayyah.Practice7.Exercise20;

public class UsingBook {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        String[] category = new String[2];
        category[0] = "Mystery";
        category[1] = "Romance";
        books[0] = new Book("love","Romance");
        books[1] = new Book("Heist","Mystery");
        books[2] = new Book("Dram","Romance");
        books[3] = new Book("Thief","Mystery");
        books[4] = new Book("Last","Romance");
        for (int i = 0 ; i < books.length ; i++) {
            for (int j = 0 ; j < category.length ; j++) {
                if (category[j].equalsIgnoreCase("Mystery")){
                    System.out.println(books[i].getName());
                }else {
                    System.out.println(books[i].getName());
                }
            }
        }
    }
}
