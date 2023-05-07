package practice9.constructorechaining1;

public class Book {
        private String title;
        private String author;
        private int yearPublished;
        private int numPages;

        public Book(String title,String author,int yearPublished,int numPages){
            this.title=title;
            this.author=author;
            this.yearPublished =yearPublished;
            this.numPages=numPages;

        }

        public Book(String title,String author){
            this(title,author,2020,530);

        }

        public Book(String title,String author,int yearPublished){
            this(title,author,yearPublished,230);
        }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearPublished=" + yearPublished +
                ", numPages=" + numPages +
                '}';
    }
}
