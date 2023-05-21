package Practice7.Book2;

public class UtilBook {
    public  Book[] sameBook(Book[] books,String category){
        Book[] sameCategory= new Book[books.length];

        for (int i = 0; i < books.length ; i++) {
          if(books[i].getCategory().equalsIgnoreCase(category))  {
              sameCategory[i]=books[i];
          }
        }
        return sameCategory;
    }
}
