package lectures_10;

class Student
{
    String name;
    int age;
    int marks;

    void study()
    {
        System.out.println(name + " is studying");
    }

    void exam()
    {
        System.out.println(name + " is giving exam");
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Student s1 = new Student();

        s1.name = "Suraj";
        s1.age = 21;
        s1.marks = 85;

        s1.study();
        s1.exam();
    }
}