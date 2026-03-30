import java.util.ArrayList;

class Book{
    String title;
    String author;
    String isbn;
    Book(String title,String author, String isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }
    void display(){
        System.out.println("title is : "+title);
        System.out.println("author is : "+author);
        System.out.println("isbn  is : "+isbn); 
    }
}
class Library{
    ArrayList<Book> book= new ArrayList<>();
    void addbooks(Book book){
        book.add("js");
        book.add("os");
        book.add("pps");

    }
    void searchbytitle(String title){

    }
    void displayallbooks(){

    }
    
}
class Final{
    public static void main(String[] args) {
        Library l=new Library();

    }
}