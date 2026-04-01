package opps_practics.classobjectconstructorethisusse;

class  Rectangle {
     int length;
     int breadth;
     Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
     }

     void calculateArea(){
        int area = length * breadth;
        System.out.println("Area of Rectangle is " + area);
     }
}

public class RectangleArea {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10,20);
        r1.calculateArea();
    }
}
