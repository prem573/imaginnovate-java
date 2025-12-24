package practice;


public class Bank {
    public static void main(String[] args) {

        Account acc = new Account(5000);

        try {
            acc.withdraw(2000);   // valid
            acc.Insert(20);
            acc.withdraw(4000);  
            
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}

class Account {

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(balance, amount);
        }

        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
    public void Insert(double amount ) {
    	balance +=amount;
    	  System.out.println("Insertion successful. Updated  balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}
