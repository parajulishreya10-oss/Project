class Payment {
    void pay() {
        System.out.println("payment");
    }
}

class CreditCardPayment extends Payment {
    void pay() {
        System.out.println("using Credit Card");
    }
}

class BankTransferPayment extends Payment {
    void pay() {
        System.out.println("using Bank Transfer");
    }
}

class UPIPayment extends Payment {
    void pay() {
        System.out.println("payment using UPI");
    }
}
public class Pay1{
    public static void main(String[] args){
        payment p;
        
    }
}

 