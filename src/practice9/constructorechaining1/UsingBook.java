package practice9.constructorechaining1;

//import com.mapsahr.practice9.constructorechaining1.Book;

public class UsingBook {
    public static void main(String[] args){
        Book book=new Book("Hunger games","mh ");
        System.out.println("the title of the book is : "+book.getTitle()+" ,the name of the author is : "+book.getAuthor()+" it was released in: "+book.getYearPublished()+" it has "+book.getNumPages()+" pages.");


        Book book1=new Book("Harry Potter","J.K Rolling",1990);
        System.out.println("the title of the book is : "+book1.getTitle()+" ,the name of the author is : "+book1.getAuthor()+" it was released in: "+book1.getYearPublished()+" it has "+book1.getNumPages()+" pages.");

        Book book2=new Book("The Great Gatsby","Scott Fitz Gerald",1890,420);
        System.out.println("the title of the book is : "+book2.getTitle()+" ,the name of the author is : "+book2.getAuthor()+" it was released in: "+book2.getYearPublished()+" it has "+book2.getNumPages()+" pages.");
    }
}
