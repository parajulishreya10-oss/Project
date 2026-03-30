class Account{
    double balance;
    Account(double balance){
        this.balance=balance;
    }
    double calculatetax(){
        return balance*0.02;
    }
    void display(){
        System.out.println("total:"+calculatetax());
    }
}
class SavingAccounts extends Account{
    SavingAccounts(double balance){
        super(balance);
    }
    double calculatetax(){
        if(balance>50000){
            return (0.04*balance)+500;
        }
        return balance*0.04;
    }
}
class FixedDeposit extends SavingAccounts{
    FixedDeposit(double balance){
        super(balance);
    }
    double calculatetax(){
        return super.calculatetax()+(balance*0.02);
    }
    void display(){
        System.out.println("balance is:"+calculatetax());
    }
}
public class CaseStudy{
    public static void main (String [] args){
        Account a=new SavingAccounts(10000);
        a.display();
        
        Account a1=new SavingAccounts(60000);
        a1.display();
        
        Account a2= new FixedDeposit(60000);
        a2.display();
    }
}

