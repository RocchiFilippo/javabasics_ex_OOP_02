package _2;

public class Student {
    String studentName = null;
    Integer studentAge = null;

    Student (String studentName, Integer studentAge)
    {
        //System.out.println("Constructing!");
        this.studentName = studentName;
        this.studentAge = studentAge;
        //System.out.println("Constructed!");

    }

    Student (String studentName)
    {
        this.studentName = studentName;
    }

    Student (Integer studentAge)
    {
        this.studentAge = studentAge;
    }

    Student ()
    {

    }

    public void printStudent()
    {
        System.out.println("Name = " + studentName);
        System.out.println("Age = " + studentAge);
    }

}
