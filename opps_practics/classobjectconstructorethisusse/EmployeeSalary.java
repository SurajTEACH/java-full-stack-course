package opps_practics.classobjectconstructorethisusse;

class Employee{
   String name;
   double salary;
   Employee(String name, double salary){
      this.name = name;
      this.salary = salary;
   }

   void display(){
      System.out.println("show result"+ "\nname:"+name+"\nsalary:"+salary);
   }
}

public class EmployeeSalary {
    public static void main(String[] args) {
         Employee e1 = new Employee("Suraj", 50000);
         e1.display();
         e1 = new Employee("Rahul", 60000);
         e1.display();
    }
}
