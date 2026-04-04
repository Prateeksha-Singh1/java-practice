class Account {
    private double balance;

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class ValidationDemo {
    public static void main(String[] args) {
        Account a = new Account();
        a.setBalance(1000);
        System.out.println(a.getBalance());

        a.setBalance(-500); // invalid
    }
}