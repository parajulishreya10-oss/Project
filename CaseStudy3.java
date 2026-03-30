 abstract class Payment{
    abstract void processpayment();
}
class CreditCard extends Payment{
    int transactionid;
    double amount;
    
}
