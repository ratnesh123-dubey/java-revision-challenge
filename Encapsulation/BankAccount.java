public class BankAccount {

    private double balance;
    private String accountHolder;

    public BankAccount(double balance, String accountHolder) {

        this.accountHolder = accountHolder;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance can't be negative");
        }
    }

    void setBalance(double balance) {

        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid Balance");
        }
    }

    double getBalance() {
        return balance;
    }

    void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    String getAccountHolder() {
        return accountHolder;
    }

    void deposit(double amount) {

        if (amount > 0) {
            balance = balance + amount;
            System.out.println(amount + " Deposited");
        } else {
            System.out.println("Invalid amount");
        }
    }

    void withdraw(double amount) {

        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println(amount + " Withdrawn");
        } else {
            System.out.println("Invalid amount");
        }
    }

    void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccount b = new BankAccount(500, "Ratnesh");

        b.deposit(100);

        b.withdraw(200);

        b.display();
    }
}
