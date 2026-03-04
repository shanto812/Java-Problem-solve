public class StudentTester1{
public static void main(String [] args){
Student s1 = new Student();
System.out.println("Name of the Student: "+s1.name);
System.out.println("ID of the Student: "+s1.id);
s1.name = "Bob";
s1.id = 123;
System.out.println("Name of the Student: "+s1.name);
System.out.println("ID of the Student: "+s1.id);
}
}
public class Student {
    String name = "Default";
    int id = 0;
}

Task 3:

public class CSECourse {
    String courseName = "Programming Language II";
    String courseCode = "CSE111";
    int credit = 3;
}


Task 4:
public class ImaginaryNumber {
    int realPart;
    int imaginaryPart;

    void printNumber() {
        System.out.println(realPart + " + " + imaginaryPart + "i");
    }
}