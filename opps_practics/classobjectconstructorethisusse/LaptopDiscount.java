package opps_practics.classobjectconstructorethisusse;

class Laptop {
     String  brand;
     double price;

     Laptop(String brand, double price){
         this.brand = brand;
         this.price = price;
     }

     double discount(double price){
        
    
         double discount = price * 0.05;
         return discount;
     }

     void display(){
         System.out.println("Show Laptop data");

        double dis =  this.discount(price);

        double newPrice = price - dis;
        System.out.println("Brand: " + brand +" "+"discount:"+dis+ ", Price: " + newPrice);

     }
}


public class LaptopDiscount {
  public static void main(String[] args) {
      Laptop l1 = new Laptop("Lenovo", 50000);
      l1.display();

      Laptop  l2 = new Laptop("Dell", 40000.0);
      l2.display();



  }
}
