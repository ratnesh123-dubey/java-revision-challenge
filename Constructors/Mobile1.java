public class Mobile1 {
    
    String brand;
    int price;
    int storage;

    Mobile1(){
        brand = "Unknown";
        price = 0;
        storage = 0;
    }

    Mobile1(String brand, int price){
         this.brand = brand;
         this.price = price;
    }

    Mobile1(String brand, int price, int storage){
          this.brand = brand;
          this.price = price;
          this.storage = storage;
    }

    void show(){
       System.out.println(brand + " " + price + " " + storage);
    }

  public static void main(String[] args){

    Mobile1 m1 = new Mobile1();
    Mobile1 m2 = new Mobile1("Samsung", 25000);
    Mobile1 m3 = new Mobile1("iPhone", 80000, 256);
    m1.show();
    m2.show();
    m3.show();

  }

}
