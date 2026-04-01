package opps_practics.classobjectconstructorethisusse;


class Car {
    String brand;
    double price;

    Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
      
    }
    
}
public class CarDetails {
    public static void main(String[] args) {
        Car c1 = new Car("Honda", 100000);

        System.out.println(c1.brand);
        System.out.println(c1.price);

         Car c2 = new Car("thar", 100000);

        System.out.println(c2.brand);
        System.out.println(c2.price);
        
    }
}
