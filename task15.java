public class Course {
    String courseName;
    String courseCode;
    int courseCredit;

    void updateDetails(String name, String code, int credit) {
        courseName = name;
        courseCode = code;
        courseCredit = credit;
    }

    void displayCourse() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Credit: " + courseCredit);
    }
}
public class Tester5{
public static void main(String[] args) {
Course c1 = new Course();
Course c2 = new Course();
c1.updateDetails("Programming Language I","CSE110", 3);
System.out.println("========== 1 ==========");
c1.displayCourse();
c2.updateDetails("Data Structures","CSE220", 3);
System.out.println("========== 2 ==========");
c2.displayCourse();
c1.updateDetails("Programming Language II","CSE111", 3);
System.out.println("========== 3 ==========");
c1.displayCourse();
}
}