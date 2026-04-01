package opps_practics.classobjectconstructorethisusse;


class Circle {
  double radius;
  Circle(double radius){
    this.radius = radius;

  }

  void calculateArea(){
    double area = 3.14 * radius * radius;
    System.out.println("Area of circle is " + area);
  }

}

public class CircleInfo {
    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        c1.calculateArea();
    }
}
