public class StudentTester{
public static void main(String[] args) {
Student std1 = new Student();
std1.showDetails();
System.out.println("1---------------");
std1.updateDetails("Alif", 3.99, 12);
System.out.println("2---------------");
std1.checkScholarshipEligibility();
System.out.println("3---------------");
std1.showDetails();
Student std2 = new Student();
std2.updateDetails("Mim", 3.4);
Student std3 = new Student();
std3.updateDetails("Henry", 3.5, 15, "BBA");
System.out.println("5---------------");
std2.checkScholarshipEligibility();
System.out.println("6---------------");
std3.checkScholarshipEligibility();
System.out.println("7---------------");
std2.showDetails();
System.out.println("8---------------");
std3.showDetails();
}
}

public class Student {
    String name = "Not Set";
    String department = "CSE";
    double cgpa = 0.0;
    int credits = 9;
    String scholarshipStatus = "Not Set";

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Credits: " + credits);
        System.out.println("Scholarship Status: " + scholarshipStatus);
    }

    public void updateDetails(String name, double cgpa, int credits) {
        this.name = name;
        this.cgpa = cgpa;
        this.credits = credits;
    }

    public void updateDetails(String name, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }

    public void updateDetails(String name, double cgpa, int credits, String dept) {
        this.name = name;
        this.cgpa = cgpa;
        this.credits = credits;
        this.department = dept;
    }

    public void checkScholarshipEligibility() {
        if (cgpa >= 3.7 && credits > 10) {
            scholarshipStatus = "Merit based scholarship";
            System.out.println(name + " is eligible for Merit based scholarship");
        } else if (cgpa >= 3.5 && credits > 10) {
            scholarshipStatus = "Need based scholarship";
            System.out.println(name + " is eligible for Need based scholarship");
        } else {
            scholarshipStatus = "No scholarship";
            System.out.println(name + " is not eligible for scholarship");
        }
    }
}