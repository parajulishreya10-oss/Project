import java.util.ArrayList;
import java.util.Scanner;

public abstract class Item{
    String itemid;
    String name;
    double baseprice;
    Item(int itemid,String name, int baseprice){
        this.itemid=itemid;
        this.name=name;
        this.baseprice=baseprice;
    }

}
class PerishableItem extends Item{
    String expirydate;
    PerishableItem(String itemid,String name, double baseprice){
        this.itemid=itemid;
        this.name=name;
        this.baseprice=baseprice;
        this.expirydate=expirydate;
    }
    int calculatetax(){
        return baseprice*0.05;
    }

}
class ElectronicItem extends Item{
    int warrantyperiod;
    ElectronicItem(String itemid,String name, double baseprice, int warrantyperiod){
        this.itemid=itemid;
        this.name=name;
        this.baseprice=baseprice;
        this.warrantyperiod=warrantyperiod;
    }
    int calculatetax(){
        return baseprice*0.15;
    }

}
public class Taxable{
    Scanner sc= new Scanner(system.in);
    int choice;
    public static void main(String[] args) {
        ArrayList<Item> inventory=new ArrayList<>();

    }
    do{
        System.out.println("enter choice");
        choice=sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                System.out.println("enter perishableitems:");
                String itemid=sc.nextLine();
                System.out.println("enter name :");
                String name=sc.nextLine();
                System.out.println("enter baseprice:");
                double baseprice=sc.nextDouble();
                sc.nextLine();
                System.out.prin
                
                break;
        
            default:
                break;
        }
    }
}


