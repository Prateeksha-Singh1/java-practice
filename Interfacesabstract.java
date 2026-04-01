interface Payment {
    void pay(double amount);
}

interface Refund {
    void refund(double amount);
}

abstract class Transaction {
    void transactionInfo() {
        System.out.println("Processing transaction...");
    }
}

class OnlinePayment extends Transaction implements Payment, Refund {

    public void pay(double amount) {
        System.out.println("Paid: " + amount);
    }

    public void refund(double amount) {
        System.out.println("Refunded: " + amount);
    }
}

public class Interfacesabstract {
    public static void main(String[] args) {
        OnlinePayment obj = new OnlinePayment();
        obj.transactionInfo();
        obj.pay(1000);
        obj.refund(500);
    }
}