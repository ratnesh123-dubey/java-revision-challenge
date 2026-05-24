class Mobile {
    
String  brand;
int price;

Mobile(String brand, int price){
    this.brand=brand;
    this.price=price;
}

void display(){
    System.out.println(brand + " " + price );
}

    
 public static void main(String[] args){
      Mobile m1 = new Mobile("Samsung",25000);
      Mobile m2 = new Mobile("iPhone", 80000);

      m1.display();
      m2.display();
}

}
