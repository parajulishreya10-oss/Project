import java.util.ArrayList;

class Book{
    String ISBN;
    String title;
    String author;
    boolean isavailable;
    Book(String ISBN,String title, String author){
        this.ISBN=ISBN;
        this.title=title;
        this.author=author;
    }
}
class Library{
    ArrayList<Book>books=new ArrayList<>();
    void addbook(Book book){
        books.add(book);
    }
}
