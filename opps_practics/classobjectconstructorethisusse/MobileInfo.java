package opps_practics.classobjectconstructorethisusse;

 class Mobile {
    
    String brand;
    String model;
    int price;

    Mobile(String brand, String model, int price){
      this.brand = brand;
      this.model = model;
      this.price = price;
    }

    void display(){
        System.out.println("Show Mobile details"+" "+"\nbrand:"+brand+"\nmodel:"+model+"\nprice:"+price);
    }
}


public class MobileInfo{
    public static void main(String[] args) {
        Mobile m1 = new Mobile("Apple", "Iphone 14", 120000);
        m1.display();
        Mobile m2 = new Mobile("Samsung", "S23", 100000);
        m2.display();

        // compare mobile price


        if(m1.price > m2.price){
            System.out.println(m1.model+" "+"is more expensive");
        }
        else if( m1.price < m2.price){
            System.out.println(m2.model+" "+"is more expensive");
        }
        else{
            System.out.println("Both mobile have same price");

        }
    }
}