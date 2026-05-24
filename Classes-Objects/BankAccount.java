class BankAccount {
    
    String accountHolder;
    int balance;

    BankAccount(String accountHolder, int balance){
           this.accountHolder = accountHolder;
           this.balance = balance;
    }

    void deposit(int amount){
           balance = balance + amount;
     }

     void withdraw(int amount){
          balance = balance - amount;
     }

     void display(){
           System.out.println("accountHolder: " + accountHolder);
           System.out.println("balance: " + balance);
     }
    
    
  public static void main(String[] args){

    BankAccount b1 = new BankAccount("Ratnesh", 1000);
    b1.deposit(500);
    b1.withdraw(200);
    b1.display();
       
   }
    
}
