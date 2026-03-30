import java.util.ArrayList;
import java.util.Scanner;

class Product{
    String name;
    double price;
    Product(String name, double price){
        this.name=name;
        this.price=price;
    }
     void displaycart(){
        System.out.println("products :"+name);
        System.out.println("prices:"+price);
    }
}
class ShoppingCart{
    ArrayList<Product> p=new ArrayList<>();
    void addproduct(Product product){
        p.add(product);
    }
    void removeproduct(String productname){
        if(p.isEmpty()){
            System.out.println("no products ");;
        }else{
            for(Product p3:p){
                if(p3.name.equals(productname)){
                    p.remove(p3);
                    System.out.println("product removed");
                    break;
                }
            }
        }
    }
    double calculatetotalcost(){
        if(p.isEmpty()){
            System.out.println("is empty ");
            return 0;
        }else{
            float total=0;
            for(Product p1:p){
                total+=p1.price;
            }
            return total;
        }
    }
    void displayallcart(){
        if(p.isEmpty()){
            System.out.println("no products dound");
        }else{
            for( Product p2:p){
                p2.displaycart();
            }
        }
    }
}
public class MainScenario3{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        ShoppingCart sp= new ShoppingCart();
        int choice;
        while(true){
            System.out.println("1.add product");
            System.out.println("2.remove product");
            System.out.println("3.displaycart");
            System.out.println("4.display totalost");
            System.out.println("5.exit");
            System.out.println("enter choice");
            choice=sc.nextInt();
            sc.nextLine();
            if(choice==1){
                System.out.println("enter namr of product:");
                String name= sc.nextLine();
                System.out.println("enter price:");
                double price= sc.nextDouble();
                sc.nextLine();
                Product p1 =new Product(name,price);
                sp.addproduct(p1);
            }
            else if(choice==2){
                System.out.println("remove productname :");
                String productname= sc.nextLine();
                sp.removeproduct(productname);
            }
            else if(choice ==3){
                sp.displayallcart();
            }else if(choice==4){
                double total=sp.calculatetotalcost();
                System.out.println("totalcost: "+total);
            }else if(choice ==5){
                System.out.println("exit");
                break;
            }else{
                System.out.println("error");
            }
        }   
        sc.close();
    }
}