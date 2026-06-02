public class Payment {
   
   void pay(){
    System.out.println("Payment Processing");
   }

   public static void main(String[] args){

    Payment p1 = new UPI();
    Payment p2 = new CreditCard();

    p1.pay();
    p2.pay();

}


}

class UPI extends Payment{
    @Override
    void pay(){
        System.out.println("Payment through UPI");
    }

}

class CreditCard extends Payment{
    @Override
    void pay(){
        System.out.println("Payment through CreditCard");
    }

}


