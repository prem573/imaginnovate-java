public class One {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
         Account acc = new Account();
        System.out.println("Current Balance: " + acc.getBalance());
        acc.deposit(5000);
        System.out.println("Current Balance: " + acc.getBalance());
        acc.deposit(2500);
        System.out.println("Current Balance: " + acc.getBalance());
    }
}
interface AccountOperation {
    void deposit(double amount);
    double getBalance();
}
class Account implements AccountOperation {

    private double balance=0;

    // constructor

    //    int  balance = 0;


    // implement deposit()
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // implement getBalance()
    public double getBalance() {
        return balance;
    }
}

