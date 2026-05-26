public class Order {
    
    int orderId;
    String productName;
    int quantity;
    int price;

    Order(int orderId){
       this(orderId, "Unknown");
    }

    Order(int orderId, String productName){
       this(orderId, productName, 0, 0);
    }

    Order(int orderId, String productName, int quantity, int price){
       this.orderId = orderId;
       this.productName = productName;
       this.quantity = quantity;
       this.price = price;
    }

    void displayOrder(){
       System.out.println("order ID: " + orderId );
       System.out.println("Product: " + productName );
       System.out.println("Quantity: " + quantity );
       System.out.println("Price: " + price );
       System.out.println();
    }

    public static void main(String[] args){
       
        Order o1 = new Order(1);
        Order o2 = new Order(2,"laptop");
        Order o3 = new Order(3,"laptop",2,12000);
        o1.displayOrder();
        o2.displayOrder();
        o3.displayOrder();

    }

}
