package opps_practics.classobjectconstructorethisusse;


class Student {
    String name;
    int marks;
    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    void checkPassFail(){
        if( marks > 33){
            System.out.println(name+" "+"pass");
        }
        else{
            System.out.println(name+" "+"fail");
        }
    }
}

public class StudenMarks {
  public static void main(String[] args) {
      Student s1 = new Student("Suraj", 50);
      s1.checkPassFail();
      Student s2 = new Student("Rahul", 30);
      s2.checkPassFail();
  }
}


