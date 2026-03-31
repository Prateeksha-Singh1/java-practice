interface Payment {
    void pay(double amount);
}

interface Notification {
    void sendNotification(String message);
}

class PaymentSystem implements Payment, Notification {

    public void pay(double amount) {
        System.out.println("Paid: " + amount);
    }

    public void sendNotification(String message) {
        System.out.println("Notification: " + message);
    }
}

public class Advance  {
    public static void main(String[] args) {
        PaymentSystem ps = new PaymentSystem();
        ps.pay(1000);
        ps.sendNotification("Payment Successful");
    }
}