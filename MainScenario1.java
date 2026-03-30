import java.util.Scanner;
import java.util.ArrayList;
class Book{
    String title;
    String author;
    String isbn;
    Book(String title, String author, String isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }
    void displaybook(){
        System.out.println("title:"+title);
        System.out.println("author:"+author);
        System.out.println("isbn:"+isbn);
    }
}
class Library{
    ArrayList<Book>books= new ArrayList<>();
    void add(Book book){
        books.add(book);
    }
    Book serch(String title){
        for(Book b:books){
            if(b.title.equalsIgnoreCase(title)){
                return b;
            }
        }
        return null;
    }
    void displayallbook(){
        if(books.isEmpty()){
            System.out.println("empty");
        }else{
            System.out.println("book found");
            for(Book b:books){
                b.displaybook();
            }
        }
    }

}
public class MainScenario1{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Library lib=new Library();
        int choice;
        while(true){
            System.out.println("1.add book");
            System.out.println("2.search book");
            System.out.println("3.disp laybook");
            System.out.println("4.exit");
            System.out.println("1.enter choice");
            choice=sc.nextInt();
            sc.nextLine();
            if(choice==1){
                System.out.println("enter title:");
                String title= sc.nextLine();
                System.out.println("enter author:");
                String author= sc.nextLine();
                System.out.println("enter isbn:");
                String isbn= sc.nextLine();
                Book b=new Book(title, author, isbn);
                lib.add(b);
            }
            else if(choice==2){
                System.out.println("enter title :");
                String title= sc.nextLine();
                Book found=lib.serch(title);
                if(found!=null){
                    System.out.println("founf");
                    found.displaybook();
                }else{
                    System.out.println("not found");
                }
            }
            else if(choice ==3){
                lib.displayallbook();
            }else if(choice ==4){
                System.out.println("exit");
                break;
            }else{
                System.out.println("error");
            }
        }
        sc.close();
    }
}
