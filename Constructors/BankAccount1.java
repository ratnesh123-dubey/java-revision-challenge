public class BankAccount1 {
    
     String accountHolder;
     double balance;
     
     BankAccount1(){

          accountHolder = "Unknown";
          balance = 0.0;

     }

     void display(){
          System.out.println("Account Holder: " + accountHolder);
          System.out.println("Balance: " + balance );
     }

     public static void main(String[] args){
         
          BankAccount1 b1 = new BankAccount1();
          b1.display();

     }     

}
