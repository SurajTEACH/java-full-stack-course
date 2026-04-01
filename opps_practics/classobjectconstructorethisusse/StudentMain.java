package opps_practics.classobjectconstructorethisusse;

 class Student {
     String rollNumber;

     String name;

     Student(){
         rollNumber = "0191CS221210";
         name = "suraj kumar shah";
     }

     void display(){
        System.out.println("show result"+ "\nrollNumber:"+rollNumber+"\nname:"+name);
     }
}

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }
}