public class Employee {
    String name;
    double salary;
    String designation;

    void newEmployee(String n) {
        name = n;
        salary = 30000;
        designation = "junior";
    }

    void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary + " Tk");
        System.out.println("Employee Designation: " + designation);
    }

    void calculateTax() {
        if (salary > 50000) {
            System.out.println(name + " Tax Amount: " + (salary * 0.3));
        } else if (salary > 30000) {
            System.out.println(name + " Tax Amount: " + (salary * 0.1));
        } else {
            System.out.println("No need to pay tax");
        }
    }

    void promoteEmployee(String newPost) {
        if (newPost.equals("senior")) {
            salary += 25000;
        } else if (newPost.equals("lead")) {
            salary += 50000;
        } else if (newPost.equals("manager")) {
            salary += 75000;
        }
        designation = newPost;
        System.out.println(name + " has been promoted to " + newPost);
        System.out.printf("New Salary: %.2f Tk\n", salary);
    }
}


public class Tester3{
public static void main(String[] args){
Employee emp1 = new Employee();
Employee emp2 = new Employee();
Employee emp3 = new Employee();
emp1.newEmployee("Harry Potter");
emp2.newEmployee("Hermione Granger");
emp3.newEmployee("Ron Weasley");
System.out.println("1 ==========");
emp1.displayInfo();
System.out.println("2 ==========");
emp2.displayInfo();
System.out.println("3 ==========");
emp3.displayInfo();
System.out.println("4 ==========");
emp1.calculateTax();
System.out.println("5 ==========");
emp1.promoteEmployee("lead");
System.out.println("6 ==========");
emp1.calculateTax();
System.out.println("7 ==========");
emp1.displayInfo();
System.out.println("8 ==========");
emp3.promoteEmployee("manager");
System.out.println("9 ==========");
emp3.calculateTax();
System.out.println("10 ==========");
emp3.displayInfo();
}
}