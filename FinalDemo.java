class Bank {
    final void rateOfInterest() {
        System.out.println("Rate of interest is fixed");
    }
}

class SBI extends Bank {
}

public class FinalDemo {
    public static void main(String[] args) {
        SBI s = new SBI();
        s.rateOfInterest();
    }
}

